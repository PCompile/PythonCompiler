lexer grammar PythonLexer;
@members {
    java.util.Stack<Integer> indents = new java.util.Stack<>();
    int opened = 0;
    Token lastToken = null;

    java.util.Queue<Token> pendingTokens = new java.util.LinkedList<>();

    @Override
    public Token nextToken() {
        if (!pendingTokens.isEmpty()) {
            return pendingTokens.poll();
        }
        Token next = super.nextToken();

        if (next.getType() == EOF && !indents.isEmpty()) {
            while (!indents.isEmpty()) {
                indents.pop();
                CommonToken dedent = new CommonToken(DEDENT, "");
                dedent.setLine(next.getLine());
                pendingTokens.add(dedent);
            }
        }

        lastToken = next;
        return next;
    }
}

// ---------- KEYWORDS ----------
INDENT : '<INDENT>' ;
DEDENT : '<DEDENT>' ;
FALSE:'False';
NONE : 'None';
TRUE : 'True';
AND  : 'and';
AS    : 'as';
ASSERT : 'assert';
ASYNC : 'async';
AWAIT : 'await';
BREAK : 'break';
CLASS : 'class';
CONTINUE: 'continue';
DEF : 'def';
DEL : 'del';
ELIF : 'elif';
ELSE : 'else';
EXCEPT: 'except';
FINALLY: 'finally';
FOR : 'for';
FROM : 'from';
GLOBAL: 'global';
IF: 'if';
IMPORT: 'import';
IN: 'in';
IS: 'is';
LAMBDA: 'lambda';
NONLOCAL: 'nonlocal';
NOT: 'not';
OR: 'or';
PASS : 'pass';
RAISE  : 'raise';
RETURN : 'return';
TRY: 'try';
WHILE : 'while';
WITH : 'with';
YIELD: 'yield';

// ---------- OPERATORS ----------
PLUS        : '+' ;
MINUS       : '-' ;
STAR        : '*' ;
SLASH       : '/' ;
PERCENT     : '%' ;
DOUBLESTAR  : '**' ;
DOUBLESLASH : '//' ;

EQ          : '==' ;
NEQ         : '!=' ;
LT          : '<' ;
GT          : '>' ;
LTE         : '<=' ;
GTE         : '>=' ;

ASSIGN        : '=' ;
PLUSEQ        : '+=' ;
MINUSEQ       : '-=' ;
STAREQ        : '*=' ;
SLASHEQ       : '/=' ;
PERCENTEQ     : '%=' ;
DOUBLESTAREQ  : '**=' ;
DOUBLESLASHEQ : '//=' ;

BIT_AND   : '&' ;
BIT_OR    : '|' ;
BIT_XOR   : '^' ;
BIT_NOT   : '~' ;
LSHIFT    : '<<' ;
RSHIFT    : '>>' ;

// ---------- DELIMITERS ----------
LPAREN    : '(' ;
RPAREN    : ')' ;

LBRACKET  : '[' ;
RBRACKET  : ']' ;

LBRACE    : '{' ;
RBRACE    : '}' ;

COMMA     : ',' ;
COLON     : ':' ;
DOT       : '.' ;
SEMI      : ';' ;
AT        : '@' ;
ELLIPSIS  : '...' ;

ARROW     : '->' ;

// ---------- STRINGS ----------
STRING
    :   '"'  ( ~["\\] | ESC )* '"'
    |   '\'' ( ~['\\] | ESC )* '\''
    |   '"""' ( ESC | ~["\\] | '\n' | '\r' )*? '"""'
    |   '\'\'\'' ( ESC | ~["\\] | '\n' | '\r' )*? '\'\'\''
    ;

fragment ESC
    : '\\' ( [bfnrt"'\\] | UNICODE )
    ;

fragment UNICODE
    : 'u' HEX HEX HEX HEX
    | 'x' HEX HEX
    ;

fragment HEX : [0-9a-fA-F] ;

// ---------- NUMBERS ----------
DOUBLE
    :   '-'? DIGITS '.' DIGITS EXP?
    ;

INT
    :   '-'? DIGITS
    ;

fragment DIGITS : [0-9]+ ;

fragment EXP : [eE] [+\-]? DIGITS ;

// ---------- IDENTIFIERS ----------
IDENTIFIER : [A-Za-z_][A-Za-z0-9_]* ;

// ---------- COMMENTS ----------
COMMENTS : '#' ~[\r\n]* -> skip ;
NEWLINE
    :   ('\r'? '\n')[ \t]*
        {
            String spaces = getText().replaceAll("[\r\n]+", "");
            int indent = spaces.length();

            int previous = indents.isEmpty() ? 0 : indents.peek();

            if (indent > previous) {
                indents.push(indent);
                pendingTokens.add(new CommonToken(INDENT, "<INDENT>"));
            } else {
                while (!indents.isEmpty() && indents.peek() > indent) {
                    indents.pop();
                    pendingTokens.add(new CommonToken(DEDENT, "<DEDENT>"));
                }
            }
        }
        -> skip
    ;



WS: [ \n\t\r]+->skip;





