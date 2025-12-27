import AST.Node;
import Visitor.JinjaVisitor;
import antlr.HtmlCssLexer;
import gen.antlr.HtmlCssParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // اقرأ ملف أو نص
        CharStream input = CharStreams.fromFileName("tests/test.html");

        // Lexer و Parser
        HtmlCssLexer lexer = new HtmlCssLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HtmlCssParser parser = new HtmlCssParser(tokens);

        // شغّل القاعدة الأساسية
        ParseTree tree = parser.document();

        // زوري الـ AST باستخدام الفيزيتر
        JinjaVisitor visitor = new JinjaVisitor();
        Node ast = visitor.visit(tree);

        // اطبعي الـ AST
        System.out.println(ast);
    }
}
