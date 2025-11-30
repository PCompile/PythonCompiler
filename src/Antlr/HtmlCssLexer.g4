lexer grammar HtmlCssLexer;

@members {
    boolean isStyleTag = false;
    boolean isClosingTag = false;
}

//   DEFAULT: HTML

HTML_COMMENT
    : '<!--' .*? '-->' -> skip
    ;

DOCTYPE
    : '<!DOCTYPE' .*? '>' -> skip
    ;

CDATA
    : '<![CDATA[' .*? ']]>' -> skip
    ;

//  Processing Instructions
PI
    : '<?' .*? '?>' -> skip
    ;

TAG_OPEN
    : '<' -> pushMode(TAG)
    ;


HTML_ENTITY
    : '&' [a-zA-Z0-9]+ ';'
    ;


HTML_TEXT
    : ~[<&]+
    ;


//   TAG mode
mode TAG;

WS_TAG
    : [ \t\r\n]+ -> skip
    ;

SLASH
    : '/'
      { isClosingTag = true; }
    ;


TAG_NAME
    : [A-Za-z] [A-Za-z0-9:-]*
      {
        String name = getText();
        isStyleTag = !isClosingTag && name.equalsIgnoreCase("style");
      }
      -> pushMode(TAG_ATTRS)
    ;


GT_AFTER_NAME
    : '>'
      {
        if (isStyleTag) { isStyleTag = false; pushMode(STYLE); }
        isClosingTag = false;
      }
      -> popMode
    ;


//   TAG_ATTRS mode
mode TAG_ATTRS;

WS_ATTR
    : [ \t\r\n]+ -> skip
    ;

ATTR_NAME
    : [A-Za-z_:] [A-Za-z0-9_:.-]*
    ;

EQ
    : '='
    ;

ATTR_VALUE_DOUBLE
    : '"' (~["\r\n])* '"'
    ;

ATTR_VALUE_SINGLE
    : '\'' (~['\r\n])* '\''
    ;

//  Self-closing tag
SLASH_GT
    : '/>'
      { isClosingTag = false; }
      -> popMode, popMode
    ;


GT
    : '>'
      {
        if (isStyleTag) { isStyleTag = false; pushMode(STYLE); }
        isClosingTag = false;
      }
      -> popMode, popMode
    ;


//   STYLE mode
mode STYLE;

// نهاية قسم الـ CSS
END_STYLE
    : '</style>'
      -> popMode
    ;

CSS_WS
    : [ \t\r\n]+ -> skip
    ;

CSS_COMMENT
    : '/*' .*? '*/' -> skip
    ;

// Basic symbols
HASH      : '#' ;
DOT       : '.' ;
LBRACE    : '{' ;
RBRACE    : '}' ;
COLON     : ':' ;
SEMI      : ';' ;
COMMA     : ',' ;
STAR      : '*' ;
PLUS      : '+' ;
GT_SEL    : '>' ;
TILDE     : '~' ;
LBRACKET  : '[' ;
RBRACKET  : ']' ;
LPAREN    : '(' ;
RPAREN    : ')' ;
AT        : '@' ;

// Values
NUMBER
    : [0-9]+ ('.' [0-9]+)?
    ;

PERCENT
    : [0-9]+ '%'
    ;

DIMENSION
    : [0-9]+ ('.' [0-9]+)? [a-zA-Z]+
    ;

// Strings
STRING
    : '"' (~["\r\n])* '"' | '\'' (~['\r\n])* '\''
    ;

// URL
URL
    : 'url' '(' (CSS_WS | STRING | ~[)\r\n])* ')'
    ;

//  Identifiers
IDENT
    : [-_a-zA-Z] [-_a-zA-Z0-9]*
    ;
