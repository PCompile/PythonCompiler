parser grammar PythonParser;

options { tokenVocab=PythonLexer; }

file_input
    : (stmt | NEWLINE)*   // zero or more statements or blank lines
    ;

stmt
    : simple_stmt                            # SimpleStmt
    | compound_stmt                          # CompoundStmtTop
    ;

simple_stmt
    : small_stmt (SEMI small_stmt)*          // require at least one small_stmt
    ;

small_stmt
    : expr_stmt                              # ExprStmt
    | return_stmt                            # ReturnStmt
    | pass_stmt                              # PassStmt
    | break_stmt                             # BreakStmt
    | continue_stmt                          # ContinueStmt
    ;

expr_stmt
    : test (ASSIGN test | augassign test)?   # AssignExpr
    ;

return_stmt
    : RETURN test?                            # ReturnExpr
    ;

pass_stmt
    : PASS                                    # PassExpr
    ;

break_stmt
    : BREAK                                   # BreakExpr
    ;

continue_stmt
    : CONTINUE                                # ContinueExpr
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
    : IF test COLON suite (ELIF test COLON suite)* (ELSE COLON suite)?  # IfStmt
    ;

for_stmt
    : FOR NAME IN test COLON suite             # ForStmt
    ;

while_stmt
    : WHILE test COLON suite                    # WhileStmt
    ;

funcdef
    : DEF NAME LPAREN parameters? RPAREN COLON suite  # FunctionDefStmt
    ;

parameters
    : NAME (COMMA NAME)*                        # ParamList
    ;

classdef
    : CLASS NAME (LPAREN NAME RPAREN)? COLON suite  # ClassDefStmt
    ;

import_stmt
    : IMPORT dotted_name (COMMA dotted_name)*      # ImportStmt
    | FROM dotted_name IMPORT NAME (COMMA NAME)*   # FromImportStmt
    ;

dotted_name
    : NAME (DOT NAME)*                             # DottedName
    ;

suite
    : simple_stmt                               # SimpleSuite
    | NEWLINE INDENT stmt+ DEDENT               # BlockSuite
    ;

test
    : or_test                                   # OrTestExpr
    ;

or_test
    : and_test ( OR and_test )*              # OrTest
    ;

and_test
    : not_test ( AND not_test )*             # AndTest
    ;

not_test
    : NOT not_test                            # NotExpr
    | comparison                              # CompExpr
    ;

comparison
    : arith_expr ( (EQ|NEQ|LT|LTE|GT|GTE) arith_expr )*  # ComparisonExpr
    ;

arith_expr
    : term ( (PLUS|MINUS) term )*              # ArithExpr
    ;

term
    : factor ( (MUL|DIV|MOD) factor )*        # TermExpr
    ;

factor
    : (PLUS|MINUS) factor                       # UnaryExpr
    | atom                                      # AtomExpr
    ;

atom
    : NAME                                      # NameAtom
    | NUMBER                                    # NumberAtom
    | STRING                                    # StringAtom
    | TRUE                                      # TrueAtom
    | FALSE                                     # FalseAtom
    | NONE                                      # NoneAtom
    | LPAREN test RPAREN                         # ParenAtom
    | atom LBRACKET test RBRACKET               # IndexAtom
    | atom DOT NAME                             # AttributeAtom
    | atom LPAREN arglist? RPAREN               # CallAtom
    ;

arglist
    : test (COMMA test)* (COMMA)?               # ArgList
    ;
