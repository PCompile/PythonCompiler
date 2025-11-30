parser grammar HtmlCssParser;

options { tokenVocab=HtmlCssLexer; }


// HTML Rules

htmlDocument
    : (element | HTML_TEXT | HTML_ENTITY)* EOF
    ;

element
    : TAG_OPEN TAG_NAME { $TAG_NAME.text.equalsIgnoreCase("style") }? attribute* GT styleContent END_STYLE
    | TAG_OPEN TAG_NAME attribute* GT htmlContent TAG_OPEN SLASH TAG_NAME GT
    | TAG_OPEN TAG_NAME attribute* SLASH_GT
    | TAG_OPEN TAG_NAME attribute* GT TAG_OPEN SLASH TAG_NAME GT
    ;

htmlContent
    : (element | HTML_TEXT | HTML_ENTITY)*
    ;

attribute
    : ATTR_NAME (EQ (ATTR_VALUE_DOUBLE | ATTR_VALUE_SINGLE))?
    ;

// CSS Rules

styleContent
    : (cssRule | CSS_WS | CSS_COMMENT | IDENT | HASH | DOT | LBRACE | RBRACE | COLON | SEMI | COMMA | STAR | PLUS | GT_SEL | TILDE | LBRACKET | RBRACKET | LPAREN | RPAREN | AT | NUMBER | PERCENT | DIMENSION | STRING | URL)*
    ;

cssRule
    : selector LBRACE declaration* RBRACE
    ;

selector
    : (IDENT | HASH | DOT | STAR | GT_SEL | PLUS | TILDE | LBRACKET | RBRACKET | COMMA | LPAREN | RPAREN | NUMBER | PERCENT | DIMENSION | STRING | URL | AT)+
    ;

declaration
    : IDENT COLON (IDENT | NUMBER | PERCENT | DIMENSION | STRING | URL | HASH | DOT | LPAREN | RPAREN | COMMA)* SEMI
    ;
