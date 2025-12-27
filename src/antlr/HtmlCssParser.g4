parser grammar HtmlCssParser;

options { tokenVocab=HtmlCssLexer; }

// ================= START =================

document
    : (node)* EOF
      #DocumentRule
    ;

node
    : html_element        #htmlElementNode
    | self_tag            #selfTagNode
    | style_element       #styleElementNode
    | text_html           #textHtmlNode
    | jinja_expr          #jinjaExprNode
    | jinja_if_block      #jinjaIfBlockNode
    | jinja_for_block     #jinjaForBlockNode
    | jinja_block_block   #jinjaBlockBlockNode
    | jinja_macro_block   #jinjaMacroBlockNode
    | jinja_include_stmt  #jinjaIncludeNode
    | jinja_set_block     #jinjaSetBlockNode
    | jinja_filter_block  #jinjaFilterBlockNode
    | jinja_call_block    #jinjaCallBlockNode
    ;

// ================= HTML =================

html_element
    : OPEN_TAG (node)* CLOSE_TAG
      #htmlElement
    ;


self_tag
    : SELF_TAG
      #selfTag
    ;

content
    : (node)*
      #contentRule
    ;

text_html
    : TEXT_HTML
      #textHtml
    ;

// ================= JINJA: EXPRESSIONS =================

jinja_expr
    : JINJA_EXPR_START expr JINJA_EXPR_END
      #jinjaExpr
    ;

// أعلى مستوى: expr يستدعي or_expr
expr
    : or_expr
      #exprRule
    ;

// or
or_expr
    : and_expr
      #orSingle
    | or_expr OR and_expr
      #orBinary
    ;

// and
and_expr
    : equality_expr
      #andSingle
    | and_expr AND equality_expr
      #andBinary
    ;

// ==, !=, <, >, <=, >=, in
equality_expr
    : additive_expr
      #equalitySingle
    | equality_expr (EQ | NEQ | LT | GT | LTE | GTE | IN) additive_expr
      #equalityBinary
    ;

// +, -, ~
additive_expr
    : multiplicative_expr
      #additiveSingle
    | additive_expr (PLUS | MINUS | TILDE) multiplicative_expr
      #additiveBinary
    ;


// *, /, %, //
multiplicative_expr
    : unary_expr
      #multiplicativeSingle
    | multiplicative_expr (STAR | SLASH | PERCENT | FLOORDIV) unary_expr
      #multiplicativeBinary
    ;

// unary: not, +, -, ~
unary_expr
    : NOT unary_expr
      #unaryNot
    | PLUS unary_expr
      #unaryPlus
    | MINUS unary_expr
      #unaryMinus
    | primary
      #unaryPrimary
    ;

// filters بعد ما نكون حسبنا القيمة الأساسية
primary
    : filter_expr
      #primaryRule
    ;

// value | value | value...
filter_expr
    : value (PIPE IDENTIFIER (LPAREN (expr (COMMA expr)*)? RPAREN)?)*
      #filterExpr
    ;

// القيم الأساسية داخل {{ ... }}
value
    : function_call
      #valueFunctionCall
    | IDENTIFIER (value_suffix)*
      #valueIdentifier
    | NUMBER
      #valueNumber
    | STRING
      #valueString
    | list_literal
      #valueListRule
    | LPAREN expr RPAREN
      #valueParen
    ;


function_call
        : IDENTIFIER LPAREN (expr (COMMA expr)*)? RPAREN
          #functionCall
        ;

// لاحقات للـ identifier: .name أو [expr]
value_suffix
    : DOT IDENTIFIER
      #dotSuffix
    | LBRACKET expr RBRACKET
      #indexSuffix
    ;


// [expr, expr, ...]
list_literal
    : LBRACKET (expr (COMMA expr)*)? RBRACKET
      #listLiteral
    ;

// العمليات داخل {{ ... }}
bin_op
    : PLUS
      #binOpPlus
    | MINUS
      #binOpMinus
    | STAR
      #binOpStar
    | SLASH
      #binOpSlash
    | PERCENT
      #binOpPercent
    | FLOORDIV
      #binOpFloorDiv
    | EQ
      #binOpEq
    | NEQ
      #binOpNeq
    | LT
      #binOpLt
    | GT
      #binOpGt
    | LTE
      #binOpLte
    | GTE
      #binOpGte
    | AND
      #binOpAnd
    | OR
      #binOpOr
    | IN
      #binOpIn
    | TILDE    // لدعم "hello" ~ "world"
      #binOpTilde
    ;

// ================= JINJA: STATEMENTS & BLOCKS =================

// {% if expr %} ... {% endif %}
jinja_if_block
    : JINJA_STMT_START IF stmt_expr JINJA_STMT_END
      content
      (JINJA_STMT_START ELIF stmt_expr JINJA_STMT_END content)*
      (JINJA_STMT_START ELSE JINJA_STMT_END content)?
      JINJA_STMT_START ENDIF JINJA_STMT_END
      #jinjaIfBlock
    ;



// تعابير داخل {% ... %}


// نفس فكرة expr لكن بتوكنات _STMT
stmt_expr
    : stmt_or_expr
      #stmtExpr
    ;

stmt_or_expr
    : stmt_or_expr PIPE_STMT IDENTIFIER_STMT (LPAREN_STMT (stmt_or_expr (COMMA_STMT stmt_or_expr)*)? RPAREN_STMT)?
      #stmtPipeCall
    | stmt_primary
      #stmtPrimaryExpr
    | NOT_STMT stmt_or_expr
      #stmtNot
    | LPAREN_STMT stmt_or_expr RPAREN_STMT
      #stmtParen
    | stmt_or_expr bin_op_stmt stmt_or_expr
      #stmtBinOp
    | stmt_or_expr logical_op_stmt stmt_or_expr
      #stmtLogicalOp
    ;


// القيم الأساسية داخل {% ... %}
stmt_primary
    : IDENTIFIER_STMT (DOT_STMT IDENTIFIER_STMT)*          // user.active, user.address.city
      #stmtIdentifier
    | NUMBER_STMT
      #stmtNumber
    | STRING_STMT
      #stmtString
    | stmt_list_literal
      #stmtList
    | stmt_call
      #stmtCall
    ;

// [1, 2, x] داخل {% ... %}
stmt_list_literal
    : LBRACKET_STMT (stmt_or_expr (COMMA_STMT stmt_or_expr)*)? RBRACKET_STMT
      #stmtListLiteral
    ;

// استدعاء دالة داخل {% ... %} مثل func(x, y)
stmt_call
    : IDENTIFIER_STMT LPAREN_STMT (stmt_or_expr (COMMA_STMT stmt_or_expr)*)? RPAREN_STMT
      #stmtFunctionCall
    ;

// العمليات الحسابية والمقارنات داخل {% ... %}
bin_op_stmt
    : PLUS_STMT
      #binOpStmtPlus
    | MINUS_STMT
      #binOpStmtMinus
    | STAR_STMT
      #binOpStmtStar
    | SLASH_STMT
      #binOpStmtSlash
    | PERCENT_STMT
      #binOpStmtPercent
    | FLOORDIV_STMT
      #binOpStmtFloorDiv
    | EQ_STMT
      #binOpStmtEq
    | NEQ_STMT
      #binOpStmtNeq
    | LT_STMT
      #binOpStmtLt
    | GT_STMT
      #binOpStmtGt
    | LTE_STMT
      #binOpStmtLte
    | GTE_STMT
      #binOpStmtGte
    | IN_STMT
      #binOpStmtIn
    ;

// العمليات المنطقية داخل {% ... %}
logical_op_stmt
    : AND_STMT
      #logicalOpStmtAnd
    | OR_STMT
      #logicalOpStmtOr
    ;

// {% for x in expr %} ... {% endfor %}
jinja_for_block
    : JINJA_STMT_START FOR IDENTIFIER_STMT IN_STMT stmt_expr (IF stmt_expr)? JINJA_STMT_END
      content
      JINJA_STMT_START ENDFOR JINJA_STMT_END
      #jinjaForBlock
    ;


// {% block name %} ... {% endblock %}
jinja_block_block
    : JINJA_STMT_START BLOCK IDENTIFIER_STMT JINJA_STMT_END
      content
      JINJA_STMT_START ENDBLOCK JINJA_STMT_END
      #jinjaBlockBlock
    ;

// {% macro name(args) %} ... {% endmacro %}
jinja_macro_block
    : JINJA_STMT_START MACRO IDENTIFIER_STMT
      (LPAREN_STMT (IDENTIFIER_STMT (COMMA_STMT IDENTIFIER_STMT)*)? RPAREN_STMT)?
      JINJA_STMT_END
      content
      JINJA_STMT_START ENDMACRO JINJA_STMT_END
      #jinjaMacroBlock
    ;

// {% include "file.html" %}
jinja_include_stmt
    : JINJA_STMT_START INCLUDE STRING_STMT JINJA_STMT_END
      #jinjaInclude
    ;

// {% set name = expr %} ... {% endset %}
jinja_set_block
    : JINJA_STMT_START SET IDENTIFIER_STMT EQ_STMT stmt_expr JINJA_STMT_END
      (content JINJA_STMT_START ENDSET JINJA_STMT_END)?
      #jinjaSetBlock
    ;

// {% filter name %} ... {% endfilter %}
jinja_filter_block
    : JINJA_STMT_START FILTER IDENTIFIER_STMT JINJA_STMT_END
      content
      JINJA_STMT_START ENDFILTER JINJA_STMT_END
      #jinjaFilterBlock
    ;

// {% call macro(args) %} ... {% endcall %}
jinja_call_block
    : JINJA_STMT_START CALL IDENTIFIER_STMT
      (LPAREN_STMT (stmt_or_expr (COMMA_STMT stmt_or_expr)*)? RPAREN_STMT)?
      JINJA_STMT_END
      content
      JINJA_STMT_START ENDCALL JINJA_STMT_END
      #jinjaCallBlock
    ;

// ================= CSS =================

// عنصر الـ style كامل
style_element
    : STYLE_OPEN css_rules STYLE_CLOSE_CSS   #styleBlock
    ;

// مجموعة قواعد CSS
css_rules
    : css_rule*   #cssRulesList
    ;

// ================= RULES =================

// قاعدة CSS: إما :root أو أي selector عادي
css_rule
    : ROOT LBRACE_CSS css_body RBRACE_CSS   #rootRule
    | selector LBRACE_CSS css_body RBRACE_CSS   #selectorRule
    ;

// ================= SELECTORS =================

// selector رئيسي يمكن أن يحتوي على عدة selectors مفصولة بفاصلة
selector
    : selector_part (COMMA_CSS selector_part)*   #selectorGroup
    ;

// سلسلة selectors مع combinators ( > , + , ~ )
selector_part
    : simple_selector (simple_selector | combinator simple_selector)*   #selectorSequence
    ;

// combinators بين selectors
combinator
    : GTCSS     #childCombinator
    | PLUSCSS   #adjacentSiblingCombinator
    | TILDECSS  #generalSiblingCombinator
    ;

// simple selector: عنصر، class، id، أو pseudo-class
simple_selector
    : IDENT?
      (class_selector
      | id_selector
      | pseudo_selector)+   #complexSimpleSelector
    | IDENT   #typeSelector
    ;

// .class
class_selector
    : DOTCSS IDENT   #classSelector
    ;

// #id
id_selector
    : HASH IDENT   #idSelector
    ;

// :hover أو أي pseudo-class
pseudo_selector
    : COLON_CSS IDENT   #pseudoClassSelector
    ;

// ================= BODY =================

// جسم القاعدة: مجموعة declarations
css_body
    : css_decl*   #cssBody
    ;

// ================= DECLARATIONS =================

// property: value; أو --variable: value;
css_decl
    : CSS_VAR COLON_CSS css_value SEMI_CSS?   #cssVariableDeclaration
    | IDENT   COLON_CSS css_value SEMI_CSS?   #cssPropertyDeclaration
    ;

// ================= VALUES =================

// قيمة CSS: مجموعة من القيم atoms
css_value
    : css_value_atom+   #cssValueSequence
    ;

css_value_atom
    : IDENT          #identValue
    | NUMBERCSS      #numberValue
    | STRING_CSS     #stringValue
    | HEX_COLOR      #hexColorValue
    | CSS_VAR        #variableReference
    | PERCENTCsd     #percentValue
    | COMMA_CSS      #commaSeparator
    | function_call2 #functionCallValue
    ;

// ================= FUNCTIONS =================

// دوال CSS: var(--x) أو rgba(...)
function_call2
    : (IDENT | VAR_FUNC | RGBA_FUNC)
      LPAREN_CSS css_value? RPAREN_CSS   #cssFunctionCall
    ;