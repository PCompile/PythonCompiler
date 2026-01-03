lexer grammar HtmlCssLexer;

// ================= DEFAULT MODE =================
DOCTYPE : '<!' ~[>]* '>' -> skip ;
STYLE_OPEN : '<style>' -> pushMode(CSS) ;
// ================= HTML =================
WS_HTML : [ \t\r\n]+ -> skip ;
SELF_TAG
    : '<' ( 'meta' | 'link' | 'img' | 'br' | 'hr' | 'input' | 'source' | 'base' | 'area' | 'col' | 'embed' | 'param' | 'track' | 'wbr' )
      (WS_HTML? ATTRIBUTE)*
      WS_HTML? '/'? '>'
    ;


OPEN_TAG  : '<' TAG_NAME (WS_HTML? ATTRIBUTE)* '>' ;
CLOSE_TAG : '</' TAG_NAME '>' ;
fragment TAG_NAME : [A-Za-z][A-Za-z0-9_-]* ;
fragment ATTRIBUTE
    : NAME ( '=' ( '"' VALUE '"' | UNQUOTED_VALUE ) )?
    ;

fragment UNQUOTED_VALUE
    : ~[ \t\r\n">]+
    ;
fragment NAME : [A-Za-z_:][A-Za-z0-9_:.-]* ;
fragment VALUE : ~["]+ ;
TEXT_HTML : ~[<{]+ ;

// ================= JINJA MODES =================
JINJA_EXPR_START    : '{{'  -> pushMode(JINJA_EXPR);
JINJA_STMT_START    : '{%'  -> pushMode(JINJA_STMT);
JINJA_COMMENT_START : '{#'  -> pushMode(JINJA_COMMENT);

mode JINJA_COMMENT;
COMMENT_TEXT : .+? -> skip ;
JINJA_COMMENT_END : '#}' -> popMode ;

mode JINJA_EXPR;
JINJA_EXPR_END : '}}' -> popMode ;
STRING : '"' (~["\\] | ESC)* '"' | '\'' (~['\\] | ESC)* '\'' ;
fragment ESC : '\\' . ;
PLUS : '+' ; MINUS : '-' ; STAR : '*' ; SLASH : '/' ; PERCENT : '%' ; FLOORDIV : '//' ;
EQ : '==' ; NEQ : '!=' ; LT : '<' ; GT : '>' ; LTE : '<=' ; GTE : '>=' ;
AND : 'and' ; OR : 'or' ; NOT : 'not' ; IN : 'in' ;
LPAREN : '(' ; RPAREN : ')' ; LBRACKET : '[' ; RBRACKET : ']' ; COMMA : ',' ; COLON : ':' ; DOT : '.' ; PIPE : '|' ; TILDE : '~' ;
IDENTIFIER : [A-Za-z_][A-Za-z0-9_]* ;
NUMBER : [0-9]+ ('.' [0-9]+)? ;

WS_EXPR : [ \t\r\n]+ -> skip ;

mode JINJA_STMT;
JINJA_STMT_END : '%}' -> popMode ;
IF : 'if'; ELSE : 'else'; ELIF : 'elif'; ENDIF : 'endif';
FOR : 'for'; ENDFOR : 'endfor'; BLOCK : 'block'; ENDBLOCK : 'endblock';
EXTENDS : 'extends'; INCLUDE : 'include'; SET : 'set'; ENDSET : 'endset';
FILTER : 'filter'; ENDFILTER : 'endfilter'; MACRO : 'macro'; ENDMACRO : 'endmacro';
CALL : 'call'; ENDCALL : 'endcall'; ENDWITH : 'endwith';
STRING_STMT : '"' (~["\\] | ESC)* '"' | '\'' (~['\\] | ESC)* '\'' ;
PLUS_STMT : '+' ; MINUS_STMT : '-' ; STAR_STMT : '*' ; SLASH_STMT : '/' ; PERCENT_STMT : '%' ; FLOORDIV_STMT : '//' ;
EQ_STMT : '==' ; NEQ_STMT : '!=' ; LT_STMT : '<' ; GT_STMT : '>' ; LTE_STMT : '<=' ; GTE_STMT : '>=' ;
AND_STMT : 'and' ; OR_STMT : 'or' ; NOT_STMT : 'not' ; IN_STMT : 'in' ;
LPAREN_STMT : '(' ; RPAREN_STMT : ')' ; LBRACKET_STMT : '[' ; RBRACKET_STMT : ']' ; COMMA_STMT : ',' ; COLON_STMT : ':' ; DOT_STMT : '.' ; PIPE_STMT : '|' ; TILDE_STMT : '~' ;
IDENTIFIER_STMT : [A-Za-z_][A-Za-z0-9_]* ;
NUMBER_STMT : [0-9]+ ('.' [0-9]+)? ;
WS_STMT : [ \t\r\n]+ -> skip ;


// ================= CSS MODE =================


// ================= STYLE CLOSE =================
// ================= CSS MODE =================
mode CSS;

STYLE_CLOSE_CSS
    : '</style>' -> popMode
    ;

// ================= COMMENTS =================
CSS_COMMENT
    : '/*' .*? '*/' -> skip
    ;

// ================= WHITESPACE =================
WS_CSS
    : [ \t\r\n]+ -> skip
    ;

// ================= SYMBOLS =================
LBRACE_CSS : '{' ;
RBRACE_CSS : '}' ;
COLON_CSS  : ':' ;
SEMI_CSS   : ';' ;
COMMA_CSS  : ',' ;
SPACE : '\n';

DOTCSS   : '.' ;
HEX_COLOR
    : '#' [0-9a-fA-F] [0-9a-fA-F] [0-9a-fA-F]               
    | '#' [0-9a-fA-F] [0-9a-fA-F] [0-9a-fA-F]
          [0-9a-fA-F] [0-9a-fA-F] [0-9a-fA-F]                
    ;
HASH     : '#' ;
GTCSS    : '>' ;
PLUSCSS  : '+' ;
TILDECSS : '~' ;
ROOT       : ':root' ;
CSS_VAR    : '--' [a-zA-Z_] [a-zA-Z0-9_-]* ;
LPAREN_CSS : '(' ;
RPAREN_CSS : ')' ;
PERCENTCsd   : '%' ;
IDENT
    : '-'? [a-zA-Z_] [a-zA-Z0-9_-]*
    ;

VAR_FUNC  : 'var' ;
RGBA_FUNC : 'rgba' ;

// ================= NUMBERS =================
NUMBERCSS
    : [0-9]+ ('.' [0-9]+)?
    ;

// ================= STRINGS =================
STRING_CSS
    : '"'  ( ~["\\] | ESCCSS )* '"'
    | '\'' ( ~['\\] | ESCCSS )* '\''
    ;

// ================= FRAGMENTS =================
fragment ESCCSS
    : '\\' .
    ;
