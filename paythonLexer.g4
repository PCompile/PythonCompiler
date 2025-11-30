lexer grammar paythonLexer;

WS: [ \t]+ -> skip ;
NEWLINE: '\r'? '\n' ;
COMMENT: '#' ~[\r\n]* -> skip ;
DEF: 'def';
RETURN: 'return';
IF: 'if';
ELSE: 'else';
ELIF: 'elif';
FOR: 'for';
IN: 'in';
WHILE: 'while';
BREAK: 'break';
CONTINUE: 'continue';
PASS: 'pass';
STRING
    : '"' (~["\\\r\n] | '\\' .)* '"'
    | '\'' (~['\\\r\n] | '\\' .)* '\''
    ;

NUMBER: [0-9]+ ('.' [0-9]+)? ;
NAME: [a-zA-Z_][a-zA-Z0-9_]* ;
ASSIGN: '=';
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
MOD: '%';
EQ: '==';
NEQ: '!=';
LT: '<';
GT: '>';
LTE: '<=';
GTE: '>=';
LPAREN: '(';
RPAREN: ')';
LBRACKET: '[';
RBRACKET: ']';
LBRACE: '{';
RBRACE: '}';
COMMA: ',';
COLON: ':';
DOT: '.';
SEMI: ';';
OR: 'or';
AND: 'and';
NOT: 'not';
TRUE: 'True';
FALSE: 'False';
NONE: 'None';
INDENT: '<INDENT>';
DEDENT: '<DEDENT>';
PLUSASSIGN: '+=' ;
MINUSASSIGN: '-=' ;
MULASSIGN: '*=' ;
DIVASSIGN: '/=' ;
MODASSIGN: '%=' ;
