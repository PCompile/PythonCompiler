package Visitor;
import AST.Flask.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import symbol_tabel.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class Builder extends PythonParserBaseVisitor<Node> {
    public  SymbolTable symbolTable = new SymbolTable();

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }
    @Override
    public Node visitFile_input(PythonParser.File_inputContext ctx) {
        Program program = new Program(ctx.start.getLine());

        for (PythonParser.StmtContext stmtCtx : ctx.stmt()) {
            Node node = visit(stmtCtx);
            if (node instanceof Statement) {
                program.addStatement((Statement) node);
            }
        }
        return program;
    }

    @Override
    public Node visitSimpleStmt(PythonParser.SimpleStmtContext ctx) {
        if (ctx.getChildCount() == 1) {
            return visit(ctx.getChild(0));
        }

        BlockState tempBlock = new BlockState(ctx.start.getLine());

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof org.antlr.v4.runtime.RuleContext) {
                Node result = visit(child);
                if (result instanceof Statement) {
                    tempBlock.addBlock((Statement) result);
                }
            }
        }
        return tempBlock;
    }

    @Override
    public Node visitSmallStmt(PythonParser.SmallStmtContext ctx) {
        if (ctx.getChildCount() == 1) {
            return visit(ctx.getChild(0));
        }
        BlockState tempBlock = new BlockState(ctx.start.getLine());
        for (int i = 0; i < ctx.getChildCount(); i+=2) {
            Node result = visit(ctx.getChild(i));
            if (result instanceof Statement) {
                tempBlock.addBlock((Statement) result);
            }
        }
        return tempBlock;
    }

    @Override
    public Node visitPassStmt(PythonParser.PassStmtContext ctx) {
        return new ControlState(ctx.start.getLine(), "PASS");
    }

    @Override
    public Node visitCompoundStmt(PythonParser.CompoundStmtContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Node visitAssignExpr(PythonParser.AssignExprContext ctx) {
        Expression left = (Expression) visit(ctx.expr(0));
        if (ctx.ASSIGN() != null) {
            Expression right = (Expression) visit(ctx.expr(1));
            String varName = ctx.expr(0).getText();

            SymbolTable.SymbolEntry entry = symbolTable.insert(varName);

            String typeStr = "Variable";
            if (right.toString().contains("Type: STRING")) typeStr = "STRING";
            else if (right.toString().contains("Type: INT")) typeStr = "INT";
            else if (right.toString().contains("ListExpr")) typeStr = "LIST";

            entry.setAttribute("type", typeStr);
            entry.setAttribute("value", ctx.expr(1).getText()); //
            return new AssignState(ctx.start.getLine(), left, right);
        } else if (ctx.augassign() != null) {
            String op = ctx.augassign().getText();

            Expression right = (Expression) visit(ctx.expr(1));
            String varName = ctx.expr(0).getText();
            if (symbolTable.lookup(varName) != null) {
                symbolTable.setAttribute(varName, "value", "Updated with " + op);
            }
            BinaryExpr arithmeticOp = new BinaryExpr(ctx.start.getLine(), op, left, right);
            return new AssignState(ctx.start.getLine(), left, arithmeticOp);
        }
        return left;
    }

    @Override
    public Node visitIntNumber(PythonParser.IntNumberContext ctx) {
        int line = ctx.start.getLine();
        String value = ctx.INT().getText();
        return new LiteralExpr(line, value, "INT");
    }

    @Override
    public Node visitNameAtom(PythonParser.NameAtomContext ctx) {
        if (symbolTable.lookup(ctx.IDENTIFIER().getText()) == null) {
            SymbolTable.SymbolEntry entry = symbolTable.insert(ctx.IDENTIFIER().getText());
            entry.setAttribute("type", "Identifier/Ref");
            entry.setAttribute("status", "Referenced on line " + ctx.start.getLine());
        }
        return new VariableExpr(
                ctx.start.getLine(),
                ctx.IDENTIFIER().getText()
        );
    }

    @Override
    public Node visitNotExpr(PythonParser.NotExprContext ctx) {
        Expression expr = (Expression) visit(ctx.expr());
        return new UnaryExpr(ctx.start.getLine(), expr);
    }

    @Override
    public Node visitAddExpr(PythonParser.AddExprContext ctx) {
        return new BinaryExpr(ctx.start.getLine(),"+", (Expression) visit(ctx.expr(0)),(Expression) visit(ctx.expr(1)));
    }

    @Override
    public Node visitMulExpr(PythonParser.MulExprContext ctx) {
        return new BinaryExpr(
                ctx.start.getLine(),
                "*",
                (Expression) visit(ctx.expr(0)),
                (Expression) visit(ctx.expr(1))
        );
    }

    @Override
    public Node visitDivExpr(PythonParser.DivExprContext ctx) {
        return new BinaryExpr(
                ctx.start.getLine(),
                "/",
                (Expression) visit(ctx.expr(0)),
                (Expression) visit(ctx.expr(1))
        );
    }

    @Override
    public Node visitModExpr(PythonParser.ModExprContext ctx) {
        return new BinaryExpr(
                ctx.start.getLine(),
                "%",
                (Expression) visit(ctx.expr(0)),
                (Expression) visit(ctx.expr(1))
        );
    }

    @Override
    public Node visitSubExpr(PythonParser.SubExprContext ctx) {
        return new BinaryExpr(
                ctx.start.getLine(),
                "-",
                (Expression) visit(ctx.expr(0)),
                (Expression) visit(ctx.expr(1))
        );
    }

    @Override
    public Node visitAndExpr(PythonParser.AndExprContext ctx) {
        return new BinaryExpr(
                ctx.start.getLine(),
                "and",
                (Expression) visit(ctx.expr(0)),
                (Expression) visit(ctx.expr(1))
        );
    }

    @Override
    public Node visitOrExpr(PythonParser.OrExprContext ctx) {
        return new BinaryExpr(
                ctx.start.getLine(),
                "or",
                (Expression) visit(ctx.expr(0)),
                (Expression) visit(ctx.expr(1))
        );
    }

    @Override
    public Node visitComparisonExpr(PythonParser.ComparisonExprContext ctx) {
        return new BinaryExpr(
                ctx.start.getLine(),
                ctx.getChild(1).getText(), // == != < > <= >=
                (Expression) visit(ctx.expr(0)),
                (Expression) visit(ctx.expr(1))
        );
    }

    @Override
    public Node visitIfStmt(PythonParser.IfStmtContext ctx) {
        Expression condition = (Expression) visit(ctx.expr(0));
        IfState ifState = new IfState(ctx.start.getLine(), condition);

        ifState.setIfBlock((BlockState) visit(ctx.suite(0)));

        int elifCount = ctx.ELIF().size();
        for (int i = 0; i < elifCount; i++) {
            Expression elifCond = (Expression) visit(ctx.expr(i + 1));
            ElifPart elifPart = new ElifPart(ctx.ELIF(i).getSymbol().getLine(), elifCond);

            BlockState elifBody = (BlockState) visit(ctx.suite(i + 1));
            for (Statement stmt : elifBody.getBlock()) {
                elifPart.addELIFBody(stmt);
            }
            ifState.addElifPart(elifPart);
        }

        if (ctx.ELSE() != null) {
            int elseIndex = ctx.suite().size() - 1;
            ifState.setElseBlock((BlockState) visit(ctx.suite(elseIndex)));
        }

        return ifState;
    }

    @Override
    public Node visitSimpleSuite(PythonParser.SimpleSuiteContext ctx) {
        BlockState block = new BlockState(ctx.start.getLine());
        Node result = visit(ctx.simple_stmt());
        if (result instanceof BlockState) {
            for (Statement s : ((BlockState) result).getBlock()) {
                block.addBlock(s);
            }
        } else if (result instanceof Statement) {
            block.addBlock((Statement) result);
        }
        return block;
    }

    @Override
    public Node visitBlockSuite(PythonParser.BlockSuiteContext ctx) {
        BlockState block = new BlockState(ctx.start.getLine());

        if (ctx.stmt() != null) {
            for (PythonParser.StmtContext stmtCtx : ctx.stmt()) {
                Node node = visit(stmtCtx);

                if (node instanceof Statement) {
                    block.addBlock((Statement) node);
                } else if (node instanceof BlockState) {
                    for (Statement s : ((BlockState) node).getBlock()) {
                        block.addBlock(s);
                    }
                }
            }
        }
        return block;
    }

    @Override
    public Node visitExprStmt(PythonParser.ExprStmtContext ctx) {
        return visit(ctx.assign_stmt());
    }

    @Override
    public Node visitWhileStmt(PythonParser.WhileStmtContext ctx) {
        Expression condition = (Expression) visit(ctx.expr());

        WhileState whileNode = new WhileState(ctx.start.getLine(), condition);

        Node bodyNode = visit(ctx.suite());

        if (bodyNode instanceof BlockState) {
            for (Statement stmt : ((BlockState) bodyNode).getBlock()) {
                whileNode.addWhileBody(stmt);
            }
        }
        else if (bodyNode instanceof Statement) {
            whileNode.addWhileBody((Statement) bodyNode);
        }

        return whileNode;
    }

    @Override
    public Node visitForStmt(PythonParser.ForStmtContext ctx) {
        int line = ctx.start.getLine();

        Expression target = new VariableExpr(line,ctx.IDENTIFIER().getText());

        Expression iterable = (Expression) visit(ctx.expr());

        ForState forState = new ForState(line, target, iterable);
        SymbolTable.SymbolEntry entry = symbolTable.insert(ctx.IDENTIFIER().getText());
        entry.setAttribute("type", "Variable (Loop)");
        entry.setAttribute("value", "Iterating from: " + ctx.expr().getText());

        Node bodyNode = visit(ctx.suite());

        if (bodyNode instanceof BlockState) {
            for (Statement stmt : ((BlockState) bodyNode).getBlock()) {
                forState.addForBody(stmt);
            }
        } else if (bodyNode instanceof Statement) {
            forState.addForBody((Statement) bodyNode);
        }

        return forState;
    }

    @Override
    public Node visitFunctionDefStmt(PythonParser.FunctionDefStmtContext ctx) {
        int line = ctx.start.getLine();
        String funcName = ctx.IDENTIFIER().getText();
        SymbolTable.SymbolEntry funcEntry = symbolTable.insert(funcName);
        funcEntry.setAttribute("type", "Function");
        funcEntry.setAttribute("value", "Line " + line);
        FuncDef funcState = new FuncDef(line, funcName);
        List<TerminalNode> params=new ArrayList<>();
        if(ctx.parameters()!=null){
            params = ctx.parameters().getTokens(PythonParser.IDENTIFIER);}
        if (ctx.parameters() != null) {
            for (TerminalNode param : params) {
                funcState.addParameter(param.getText());
                SymbolTable.SymbolEntry paramEntry = symbolTable.insert(param.getText());
                paramEntry.setAttribute("type", "Parameter");
                paramEntry.setAttribute("value", "From func: " + funcName);
            }

        }
        Node bodyNode = visit(ctx.suite());

        if (bodyNode instanceof BlockState) {
            for (Statement stmt :(((BlockState) bodyNode).getBlock())){
                funcState.addFunBody(stmt);
            }
        } else if (bodyNode instanceof Statement) {
            funcState.addFunBody((Statement) bodyNode);
        }

        return funcState;
    }

    @Override
    public Node visitCallExpr(PythonParser.CallExprContext ctx) {
        Expression target = (Expression) visit(ctx.atom());
        CallExpr call=new CallExpr(ctx.start.getLine(),target);
        if (ctx.arglist() != null) {
            for (int i = 0; i < ctx.arglist().getChildCount(); i++) {
                ParseTree child = ctx.arglist().getChild(i);

                if (child instanceof org.antlr.v4.runtime.RuleContext) {
                    Node result = visit(child);
                    if (result instanceof Expression) {
                        call.addArg((Expression) result);
                    }
                }
            }
        }
        return call;
    }

    @Override
    public Node visitReturnStmt(PythonParser.ReturnStmtContext ctx) {
        return visit(ctx.return_stmt());
    }

    @Override
    public Node visitReturnExpr(PythonParser.ReturnExprContext ctx) {
        Expression value = null;
        if (ctx.expr() != null) {
            value = (Expression) visit(ctx.expr());
        }

        return new ReturnState(ctx.start.getLine(),value);
    }

    @Override
    public Node visitBreakStmt(PythonParser.BreakStmtContext ctx) {
        return new ControlState(ctx.start.getLine(),"Break");

    }

    @Override
    public Node visitContinueStmt(PythonParser.ContinueStmtContext ctx) {
        return new ControlState(ctx.start.getLine(),"Continue");

    }

    @Override
    public Node visitBracketAtomExpr(PythonParser.BracketAtomExprContext ctx) {
        ListExpr elements = new ListExpr(ctx.start.getLine());
        for (PythonParser.AtomContext a : ctx.atom()) {
            elements.addElement((Expression) visit(a));
        }
        return elements;
    }

    @Override
    public Node visitBRACEAtomExpr(PythonParser.BRACEAtomExprContext ctx) {
        SetExpr elements = new SetExpr(ctx.start.getLine());
        for (PythonParser.AtomContext a : ctx.atom()) {
            elements.addElement((Expression) visit(a));
        }
        return elements;
    }

    @Override
    public Node visitParenAtomExpr(PythonParser.ParenAtomExprContext ctx) {
        TupleExpr elements = new TupleExpr(ctx.start.getLine());
        for (PythonParser.AtomContext a : ctx.atom()) {
            elements.addElement((Expression) visit(a));
        }
        return elements;
    }

    @Override
    public Node visitParenExpr(PythonParser.ParenExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Node visitClassDefStmt(PythonParser.ClassDefStmtContext ctx) {
        int line = ctx.start.getLine();
        String className = ctx.IDENTIFIER(0).getText();
        String classParentName="";
        SymbolTable.SymbolEntry entry = symbolTable.insert(className);
        entry.setAttribute("type", "CLASS");
        if (ctx.IDENTIFIER().size() > 1) {
            classParentName=(ctx.IDENTIFIER(1).getText());
            entry.setAttribute("parent", classParentName);
        }
        entry.setAttribute("defined_at_line", String.valueOf(line));
        ClassState classState = new ClassState(line, className,classParentName);

        @SuppressWarnings("unchecked")
        Node bodyNode = visit(ctx.suite());
        if (bodyNode instanceof BlockState) {
            for (Statement stmt : ((BlockState) bodyNode).getBlock()) {
                classState.addBodyClass(stmt);
            }
        } else if (bodyNode instanceof Statement) {
            classState.addBodyClass((Statement) bodyNode);
        }
        return classState;
    }

    @Override
    public Node visitImportStmt(PythonParser.ImportStmtContext ctx) {
        int line = ctx.start.getLine();
        ImportState importState = new ImportState(line);

        for (PythonParser.Dotted_nameContext dn : ctx.dotted_name()) {
            importState.addPath(dn.getText());
            SymbolTable.SymbolEntry entry = symbolTable.insert(dn.getText());
            entry.setAttribute("type", "MODULE/IMPORT");
            entry.setAttribute("defined_at_line", String.valueOf(line));
        }

        return importState;
    }

    @Override
    public Node visitFromImportStmt(PythonParser.FromImportStmtContext ctx) {
        int line = ctx.start.getLine();

        String module = ctx.dotted_name().getText();
        FromImportState fromState = new FromImportState(line, module);

        for (TerminalNode id : ctx.IDENTIFIER()) {
            fromState.addName(id.getText());
            SymbolTable.SymbolEntry entry = symbolTable.insert(id.getText());
            entry.setAttribute("type", "IMPORTED_NAME");
            entry.setAttribute("from_module", module);
            entry.setAttribute("defined_at_line", String.valueOf(line));
        }
        return fromState;
    }

    @Override
    public Node visitDoubleNumber(PythonParser.DoubleNumberContext ctx) {
        int line = ctx.start.getLine();
        String value = ctx.DOUBLE().getText();
        return new LiteralExpr(line, value, "DOUBLE");
    }

    @Override
    public Node visitStringAtom(PythonParser.StringAtomContext ctx) {
        int line = ctx.start.getLine();
        String value = ctx.STRING().getText();
        return new LiteralExpr(line, value, "STRING");
    }

    @Override
    public Node visitTrueAtom(PythonParser.TrueAtomContext ctx) {
        int line = ctx.start.getLine();
        return new LiteralExpr(line, "True", "BOOLEAN");
    }

    @Override
    public Node visitAtDecorate(PythonParser.AtDecorateContext ctx) {
        int line = ctx.start.getLine();
        return new LiteralExpr(line, "@", "Decorate");
    }

    @Override
    public Node visitFalseAtom(PythonParser.FalseAtomContext ctx) {
        int line = ctx.start.getLine();
        return new LiteralExpr(line, "False", "BOOLEAN");
    }

    @Override
    public Node visitNoneAtom(PythonParser.NoneAtomContext ctx) {
        int line = ctx.start.getLine();
        return new LiteralExpr(line, "None", "NONE");
    }

    @Override
    public Node visitAttributeExpr(PythonParser.AttributeExprContext ctx) {
        if (symbolTable.lookup(ctx.atom().getText()) == null) {
            SymbolTable.SymbolEntry entry = symbolTable.insert(ctx.atom().getText());
            entry.setAttribute("type", "OBJECT/MODULE");
            entry.setAttribute("status", "Referenced for attribute: " + ctx.IDENTIFIER().getText());
        }
        return new AttributeExpr(
                ctx.start.getLine(),
                (Expression) visit(ctx.atom()),
                ctx.IDENTIFIER().getText()
        );
    }

    @Override
    public Node visitIndexExpr(PythonParser.IndexExprContext ctx) {
        return new IndexExpr(
                ctx.start.getLine(),
                (Expression) visit(ctx.atom()),
                (Expression) visit(ctx.expr())
        );
    }
}

