import AST.Node;
import Visitor.JinjaVisitor;
import Visitor.SemanticVisitor;
import antlr.HtmlCssLexer;
import antlr.HtmlCssParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // 1️⃣ اقرأ الملف
        CharStream input = CharStreams.fromFileName("tests/test.html");

        // 2️⃣ Lexer & Parser
        HtmlCssLexer lexer = new HtmlCssLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HtmlCssParser parser = new HtmlCssParser(tokens);

        // 3️⃣ Parse Tree
        ParseTree tree = parser.document();

        // 4️⃣ AST Visitor (بناء الشجرة)
        JinjaVisitor astVisitor = new JinjaVisitor();
        Node ast = astVisitor.visit(tree);

        // 5️⃣ طباعة AST
        System.out.println("===== AST =====");
        System.out.println(ast);

        // 6️⃣ Semantic Visitor (Symbol Table)
        SemanticVisitor semanticVisitor = new SemanticVisitor();
        semanticVisitor.visit(tree); // هون تنطبع Symbol Table
    }
}
