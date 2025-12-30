parser grammar PythonParser;


options { tokenVocab=PythonLexer; }

file_input
    : (stmt | NEWLINE)*   // zero or more statements or blank lines
    ;

stmt
    : simple_stmt                            # SimpleStmt
    | compound_stmt                          # CompoundStmt
    ;

simple_stmt
    : small_stmt (SEMI small_stmt)*          # SmallStmt
    ;

small_stmt
    : assign_stmt                            # ExprStmt
    | return_stmt                            # ReturnStmt
    | PASS                                   # PassStmt
    | BREAK                                  # BreakStmt
    | CONTINUE                               # ContinueStmt
    ;

assign_stmt
    : expr (ASSIGN expr | augassign expr)?   # AssignExpr
    ;

return_stmt
    : RETURN expr?                            # ReturnExpr
    ;


augassign
    : PLUSASSIGN
    | MINUSASSIGN
    | MULASSIGN
    | DIVASSIGN
    | MODASSIGN
    ;

compound_stmt
    : if_stmt                                 # IfStatement
    | for_stmt                                # ForStatement
    | while_stmt                              # WhileStatement
    | funcdef                                 # FunctionDef
    | classdef                                # ClassDef
    | import_stmt                             # ImportStatement
    ;

if_stmt
    : IF expr COLON suite (ELIF expr COLON suite)* (ELSE COLON suite)?  # IfStmt
    ;

for_stmt
    : FOR IDENTIFIER IN expr COLON suite             # ForStmt
    ;

while_stmt
    : WHILE expr COLON suite                    # WhileStmt
    ;

funcdef
    : DEF IDENTIFIER LPAREN parameters? RPAREN COLON suite  # FunctionDefStmt
    ;

parameters
    : IDENTIFIER (COMMA IDENTIFIER)*                        # ParamList
    ;

classdef
    : CLASS IDENTIFIER (LPAREN IDENTIFIER RPAREN)? COLON suite  # ClassDefStmt
    ;

import_stmt
    : IMPORT dotted_name (COMMA dotted_name)*      # ImportStmt
    | FROM dotted_name IMPORT IDENTIFIER (COMMA IDENTIFIER)*   # FromImportStmt
    ;

dotted_name
    : IDENTIFIER (DOT IDENTIFIER)*                             # DottedName
    ;

suite
    : simple_stmt                               # SimpleSuite
    | NEWLINE INDENT stmt+ DEDENT               # BlockSuite
    ;

expr
    : expr OR expr                      # OrExpr
    | expr AND expr                     # AndExpr
    | NOT expr                          # NotExpr
    | expr (EQ|NEQ|LT|LTE|GT|GTE) expr  # ComparisonExpr
    | expr PLUS expr                    # AddExpr
    | expr MINUS expr                   # SubExpr
    | expr MUL expr                     # MulExpr
    | expr DIV expr                     # DivExpr
    | expr MOD expr                     # ModExpr
    | atom                              # AtomExpr
    ;

atom
    : INT                               # IntNumber
    | DOUBLE                            # DoubleNumber
    | STRING                            # StringAtom
    | TRUE                              # TrueAtom
    | FALSE                             # FalseAtom
    | NONE                              # NoneAtom
    | IDENTIFIER                        # NameAtom
    | LBRACKET atom (COMMA atom)* RBRACKET   # BracketAtomExpr
    | LBRACE atom (COMMA atom)* RBRACE   # BRACEAtomExpr
    | LPAREN atom (COMMA)*(atom)* RPAREN   # ParenAtomExpr
    | LPAREN expr RPAREN                # ParenExpr
    | LBRACKET expr RBRACKET            # BracketExpr
    | atom LBRACKET expr RBRACKET       # IndexExpr
    | atom DOT IDENTIFIER               # AttributeExpr
    | atom LPAREN arglist? RPAREN       # CallExpr
    ;
arglist
    : expr (COMMA expr)* (COMMA)?       # ArgList
    ;



//test
//    : or_test                                   # OrTestExpr
//    ;
//
//or_test
//    : and_test ( OR and_test )*              # OrTest
//    ;
//
//and_test
//    : not_test ( AND not_test )*             # AndTest
//    ;
//
//not_test
//    : NOT not_test                            # NotExpr
//    | comparison                              # CompExpr
//    ;
//
//comparison
//    : arith_expr ( (EQ|NEQ|LT|LTE|GT|GTE) arith_expr )*  # ComparisonExpr
//    ;
//
//arith_expr
//    : term ( (PLUS|MINUS) term )*              # ArithExpr
//    ;
//
//term
//    : factor ( (MUL|DIV|MOD) factor )*        # TermExpr
//    ;
//
//factor
//    : (PLUS|MINUS) factor                       # UnaryExpr
//    | atom                                      # AtomExpr
//    ;
//
//atom
//    : number                                    # NumberAtom
//    | STRING                                    # StringAtom
//    | TRUE                                      # TrueAtom
//    | FALSE                                     # FalseAtom
//    | NONE                                      # NoneAtom
//    | LPAREN test RPAREN                        # ParenAtom
//    | atom LBRACKET test RBRACKET               # IndexAtom
//    | atom DOT IDENTIFIER                       # AttributeAtom
//    | atom LPAREN arglist? RPAREN               # CallAtom
//    |IDENTIFIER                                 # NameAtom
//    ;
//
//number
//       :
//       INT                                      #IntNumber
//       |
//       DOUBLE                                   #DoubleNumber
//       ;
//arglist
//    : test (COMMA test)* (COMMA)?               # ArgList
//    ;
