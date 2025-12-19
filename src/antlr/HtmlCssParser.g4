parser grammar HtmlCssParser;

options { tokenVocab=HtmlCssLexer; }

document
    : (node)* EOF
    ;

node
    : html_element
    | self_tag
    | style_element
    | text_html
    | jinja_expr
    | jinja_if_block
    | jinja_for_block
    | jinja_block_block
    | jinja_macro_block
    | jinja_include_stmt
    | jinja_set_block
    | jinja_filter_block
    | jinja_call_block
    ;

// ================= HTML =================

html_element
    : OPEN_TAG content CLOSE_TAG
    ;

self_tag
    : SELF_TAG
    ;

content
    : (node)*
    ;

text_html
    : TEXT_HTML
    ;

// ================= JINJA: EXPRESSIONS =================

jinja_expr
    : JINJA_EXPR_START expr JINJA_EXPR_END
    ;

expr
    : primary (PIPE IDENTIFIER (LPAREN (expr (COMMA expr)*)? RPAREN)?)*   // filters
    | expr bin_op expr
    | NOT expr
    | LPAREN expr RPAREN
    ;

primary
    : IDENTIFIER (DOT IDENTIFIER)*
    | NUMBER
    | STRING
    | list_literal
    ;

list_literal
    : LBRACKET (expr (COMMA expr)*)? RBRACKET
    ;

bin_op
    : PLUS
    | MINUS
    | STAR
    | SLASH
    | PERCENT
    | FLOORDIV
    | EQ
    | NEQ
    | LT
    | GT
    | LTE
    | GTE
    | AND
    | OR
    | IN
    ;

// ================= JINJA: STATEMENTS & BLOCKS =================

// {% if expr %} ... {% endif %}
jinja_if_block
    : JINJA_STMT_START IF expr JINJA_STMT_END
      content
      (JINJA_STMT_START ELIF expr JINJA_STMT_END content)*
      (JINJA_STMT_START ELSE JINJA_STMT_END content)?
      JINJA_STMT_START ENDIF JINJA_STMT_END
    ;

// {% for x in expr %} ... {% endfor %}
jinja_for_block
    : JINJA_STMT_START FOR IDENTIFIER IN expr JINJA_STMT_END
      content
      JINJA_STMT_START ENDFOR JINJA_STMT_END
    ;

// {% block name %} ... {% endblock %}
jinja_block_block
    : JINJA_STMT_START BLOCK IDENTIFIER JINJA_STMT_END
      content
      JINJA_STMT_START ENDBLOCK JINJA_STMT_END
    ;

// {% macro name(args) %} ... {% endmacro %}
jinja_macro_block
    : JINJA_STMT_START MACRO IDENTIFIER
      (LPAREN (IDENTIFIER (COMMA IDENTIFIER)*)? RPAREN)?
      JINJA_STMT_END
      content
      JINJA_STMT_START ENDMACRO JINJA_STMT_END
    ;

// {% include "file.html" %}
jinja_include_stmt
    : JINJA_STMT_START INCLUDE STRING_STMT JINJA_STMT_END
    ;

// {% set name = expr %} ... {% endset %}
jinja_set_block
    : JINJA_STMT_START SET IDENTIFIER EQ expr JINJA_STMT_END
      (content JINJA_STMT_START ENDSET JINJA_STMT_END)?
    ;

// {% filter name %} ... {% endfilter %}
jinja_filter_block
    : JINJA_STMT_START FILTER IDENTIFIER JINJA_STMT_END
      content
      JINJA_STMT_START ENDFILTER JINJA_STMT_END
    ;

// {% call macro(args) %} ... {% endcall %}
jinja_call_block
    : JINJA_STMT_START CALL IDENTIFIER
      (LPAREN (expr (COMMA expr)*)? RPAREN)?
      JINJA_STMT_END
      content
      JINJA_STMT_START ENDCALL JINJA_STMT_END
    ;

// ================= CSS =================

style_element
    : STYLE_OPEN css_rules STYLE_CLOSE_CSS
      #StyleElement
    ;

css_rules
    : (css_rule)*
      #CssRules
    ;

// selector { declarations }
css_rule
    : selector LBRACE_CSS css_body RBRACE_CSS
      #CssRule
    ;

// ================= SELECTORS =================

selector
    : selector_part (COMMA_CSS selector_part)*
      #SelectorGroup
    ;

selector_part
    : simple_selector (combinator simple_selector)*
      #SelectorChain
    ;

simple_selector
    : IDENT?
      (class_selector
      | id_selector
      | pseudo_selector)*
      #SimpleSelector
    ;

class_selector
    : DOTCSS IDENT
      #ClassSelector
    ;

id_selector
    : HASH IDENT
      #IdSelector
    ;

pseudo_selector
    : COLON_CSS IDENT
      #PseudoSelector
    ;

combinator
    : GTCSS     #ChildCombinator
    | PLUSCSS   #AdjacentCombinator
    | TILDECSS  #SiblingCombinator
    ;

// ================= BODY =================

css_body
    : (css_decl)*
      #CssBody
    ;

// property : value ;
css_decl
    : IDENT COLON_CSS css_value SEMI_CSS?
      #CssDeclaration
    ;

// ================= VALUES =================

css_value
    : css_value_atom+
      #ValueList
    ;

css_value_atom
    : IDENT        #IdentValue
    | NUMBERCSS    #NumberValue
    | STRING_CSS   #StringValue
    | HASH         #HexValue
    | COMMA_CSS    #CommaSeparator
    ;
