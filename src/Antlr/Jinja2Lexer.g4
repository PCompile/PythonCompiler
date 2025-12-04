lexer grammar Jinja2Lexer;

// ================= DEFAULT MODE (HTML mode) =================

JINJA_EXPR_START    : '{{'  -> pushMode(JINJA_EXPR);
JINJA_STMT_START    : '{%'  -> pushMode(JINJA_STMT);
JINJA_COMMENT_START : '{#'  -> pushMode(JINJA_COMMENT);

TEXT : ( ~[{] | '{' ~[{%#] )+ ;

WS : [ \t\r\n]+ -> skip ;


// ================= COMMENT MODE =================

mode JINJA_COMMENT;

COMMENT_TEXT : .*? -> skip ;
JINJA_COMMENT_END : '#}' -> popMode ;


// ================= EXPR MODE =================

mode JINJA_EXPR;

JINJA_EXPR_END : '}}' -> popMode ;

// Identifiers
IDENTIFIER : [A-Za-z_][A-Za-z0-9_]* ;

// Numbers
NUMBER : DIGITS ('.' DIGITS)? ;
fragment DIGITS : [0-9]+ ;

// Strings
STRING
    : '"'  ( ~["\\] | ESC )* '"'
    | '\'' ( ~['\\] | ESC )* '\''
    ;
fragment ESC : '\\' . ;

// Operators
PLUS        : '+' ;
MINUS       : '-' ;
STAR        : '*' ;
SLASH       : '/' ;
PERCENT     : '%' ;
POW         : '**' ;
FLOORDIV    : '//' ;

EQ          : '==' ;
NEQ         : '!=' ;
LT          : '<' ;
GT          : '>' ;
LTE         : '<=' ;
GTE         : '>=' ;

AND         : 'and' ;
OR          : 'or' ;
NOT         : 'not' ;
IN          : 'in' ;

// Delimiters
LPAREN      : '(' ;
RPAREN      : ')' ;
LBRACKET    : '[' ;
RBRACKET    : ']' ;
LBRACE      : '{' ;
RBRACE      : '}' ;
COMMA       : ',' ;
COLON       : ':' ;
DOT         : '.' ;
PIPE        : '|' ;
TILDE       : '~' ;

WS_EXPR : [ \t\r\n]+ -> skip ;


// ================= STATEMENT MODE =================

mode JINJA_STMT;

JINJA_STMT_END : '%}' -> popMode ;

// Keywords
IF        : 'if';
ELSE      : 'else';
ELIF      : 'elif';
ENDIF     : 'endif';

FOR       : 'for';
ENDFOR    : 'endfor';

BLOCK     : 'block';
ENDBLOCK  : 'endblock';

EXTENDS   : 'extends';
INCLUDE   : 'include';

SET       : 'set';
ENDSET    : 'endset';

FILTER    : 'filter';
ENDFILTER : 'endfilter';

MACRO     : 'macro';
ENDMACRO  : 'endmacro';

CALL      : 'call';
ENDCALL   : 'endcall';

ENDWITH   : 'endwith';

// Identifiers
IDENTIFIER_STMT : [A-Za-z_][A-Za-z0-9_]* ;

// Numbers
NUMBER_STMT : DIGITS ('.' DIGITS)? ;

// Strings
STRING_STMT
    : '"'  ( ~["\\] | ESC )* '"'
    | '\'' ( ~['\\] | ESC )* '\''
    ;

// Operators
PLUS_STMT        : '+' ;
MINUS_STMT       : '-' ;
STAR_STMT        : '*' ;
SLASH_STMT       : '/' ;
PERCENT_STMT     : '%' ;
POW_STMT         : '**' ;
FLOORDIV_STMT    : '//' ;

EQ_STMT          : '==' ;
NEQ_STMT         : '!=' ;
LT_STMT          : '<' ;
GT_STMT          : '>' ;
LTE_STMT         : '<=' ;
GTE_STMT         : '>=' ;

AND_STMT         : 'and' ;
OR_STMT          : 'or' ;
NOT_STMT         : 'not' ;
IN_STMT          : 'in' ;

// Delimiters
LPAREN_STMT      : '(' ;
RPAREN_STMT      : ')' ;
LBRACKET_STMT    : '[' ;
RBRACKET_STMT    : ']' ;
LBRACE_STMT      : '{' ;
RBRACE_STMT      : '}' ;
COMMA_STMT       : ',' ;
COLON_STMT       : ':' ;
DOT_STMT         : '.' ;
PIPE_STMT        : '|' ;
TILDE_STMT       : '~' ;

// Ignore whitespace
WS_STMT : [ \t\r\n]+ -> skip ;
