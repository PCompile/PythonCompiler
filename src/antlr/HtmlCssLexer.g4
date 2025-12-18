lexer grammar HtmlCssLexer;

DOCTYPE : '<!' ~[>]* '>' -> skip ;
STYLE_OPEN : '<style>' -> pushMode(CSS) ;

// ================= HTML =================
OPEN_TAG  : '<' TAG_NAME (WS_HTML? ATTRIBUTE)* '>' ;
CLOSE_TAG : '</' TAG_NAME '>' ;
SELF_TAG  : '<' TAG_NAME (WS_HTML? ATTRIBUTE)* '/>' ;
fragment TAG_NAME : [A-Za-z][A-Za-z0-9_-]* ;
fragment ATTRIBUTE : NAME '=' '"' VALUE '"' ;
fragment NAME : [A-Za-z_:][A-Za-z0-9_:.-]* ;
fragment VALUE : ~["]+ ;
TEXT_HTML : ~[{<]+ ;
WS_HTML : [ \t\r\n]+ -> skip ;

// ================= JINJA MODES =================
JINJA_EXPR_START    : '{{'  -> pushMode(JINJA_EXPR);
JINJA_STMT_START    : '{%'  -> pushMode(JINJA_STMT);
JINJA_COMMENT_START : '{#'  -> pushMode(JINJA_COMMENT);

mode JINJA_COMMENT;
COMMENT_TEXT : .*? -> skip ;
JINJA_COMMENT_END : '#}' -> popMode ;

mode JINJA_EXPR;
JINJA_EXPR_END : '}}' -> popMode ;
IDENTIFIER : [A-Za-z_][A-Za-z0-9_]* ;
NUMBER : [0-9]+ ('.' [0-9]+)? ;
STRING : '"' (~["\\] | ESC)* '"' | '\'' (~['\\] | ESC)* '\'' ;
fragment ESC : '\\' . ;
PLUS : '+' ; MINUS : '-' ; STAR : '*' ; SLASH : '/' ; PERCENT : '%' ; FLOORDIV : '//' ;
EQ : '==' ; NEQ : '!=' ; LT : '<' ; GT : '>' ; LTE : '<=' ; GTE : '>=' ;
AND : 'and' ; OR : 'or' ; NOT : 'not' ; IN : 'in' ;
LPAREN : '(' ; RPAREN : ')' ; LBRACKET : '[' ; RBRACKET : ']' ; COMMA : ',' ; COLON : ':' ; DOT : '.' ; PIPE : '|' ; TILDE : '~' ;
WS_EXPR : [ \t\r\n]+ -> skip ;

mode JINJA_STMT;
JINJA_STMT_END : '%}' -> popMode ;
IF : 'if'; ELSE : 'else'; ELIF : 'elif'; ENDIF : 'endif';
FOR : 'for'; ENDFOR : 'endfor'; BLOCK : 'block'; ENDBLOCK : 'endblock';
EXTENDS : 'extends'; INCLUDE : 'include'; SET : 'set'; ENDSET : 'endset';
FILTER : 'filter'; ENDFILTER : 'endfilter'; MACRO : 'macro'; ENDMACRO : 'endmacro';
CALL : 'call'; ENDCALL : 'endcall'; ENDWITH : 'endwith';
IDENTIFIER_STMT : [A-Za-z_][A-Za-z0-9_]* ;
NUMBER_STMT : [0-9]+ ('.' [0-9]+)? ;
STRING_STMT : '"' (~["\\] | ESC)* '"' | '\'' (~['\\] | ESC)* '\'' ;
PLUS_STMT : '+' ; MINUS_STMT : '-' ; STAR_STMT : '*' ; SLASH_STMT : '/' ; PERCENT_STMT : '%' ; FLOORDIV_STMT : '//' ;
EQ_STMT : '==' ; NEQ_STMT : '!=' ; LT_STMT : '<' ; GT_STMT : '>' ; LTE_STMT : '<=' ; GTE_STMT : '>=' ;
AND_STMT : 'and' ; OR_STMT : 'or' ; NOT_STMT : 'not' ; IN_STMT : 'in' ;
LPAREN_STMT : '(' ; RPAREN_STMT : ')' ; LBRACKET_STMT : '[' ; RBRACKET_STMT : ']' ; COMMA_STMT : ',' ; COLON_STMT : ':' ; DOT_STMT : '.' ; PIPE_STMT : '|' ; TILDE_STMT : '~' ;
WS_STMT : [ \t\r\n]+ -> skip ;


// ================= CSS MODE =================
mode CSS;

STYLE_CLOSE_CSS
    : '</style>' -> popMode
    ;
CSS_COMMENT
    : '/*' .*? '*/' -> skip
    ;
WS_CSS
    : [ \t\r\n]+ -> skip
    ;
LBRACE_CSS : '{' ;
RBRACE_CSS : '}' ;
COLON_CSS  : ':' ;
SEMI_CSS   : ';' ;
COMMA_CSS  : ',' ;

DOTCSS   : '.' ;
HASH     : '#' ;
GTCSS    : '>' ;
PLUSCSS  : '+' ;
TILDECSS : '~' ;
IDENT
    : '-'? [a-zA-Z_] [a-zA-Z0-9_-]*
    ;
NUMBERCSS
    : [0-9]+ ('.' [0-9]+)?
    ;
STRING_CSS
    : '"'  ( ~["\\] | ESCCSS )* '"'
    | '\'' ( ~['\\] | ESCCSS )* '\''
    ;
fragment ESCCSS
    : '\\' .
    ;
