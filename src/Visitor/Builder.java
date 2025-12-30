//package Visitor;
//import AST.Flask.Node;
//import AST.Flask.Program;
//import AST.Flask.Statement;
//import antlr.PythonParserBaseVisitor;
//import antlr.PythonParser;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Builder extends PythonParserBaseVisitor<Node> {
//    @Override
//    public Node visitFile_input(PythonParser.File_inputContext ctx) {
//        Program program = new Program(ctx.start.getLine());
//
//        for (var child : ctx.children) {
//            if (child instanceof PythonParser.StmtContext) {
//                Statement stmt = (Statement) visit(child);
//                program.addStatement(stmt);
//            }
//        }
//        return program;
//    }
//
//    @Override
//    public Node visitSimpleStmt(PythonParser.SimpleStmtContext ctx) {
//        List<Statement> stmts = new ArrayList<>();
//
//        // كل child من النوع small_stmt
//        for (PythonParser.Small_stmtContext sctx : ctx.getRuleContexts(PythonParser.Small_stmtContext.class)){
//            Statement stmt = (Statement) visit(sctx); // زيارة كل small_stmt
//            stmts.add(stmt);
//        }
//
//    }
//
//
//    @Override
//    public Node visitCompoundStmt(PythonParser.CompoundStmtContext ctx) {
//        return visit(ctx.getChild(0));
//    }
//
//
//
//
//}
