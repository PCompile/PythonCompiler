import AST.Node;
import Visitor.JinjaVisitor;
import Visitor.SemanticVisitor;
import antlr.HtmlCssLexer;
import antlr.HtmlCssParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {

        String[] files = {
                "templates/list.html",
                "templates/add.html",
                "templates/details.html"
        };

        SemanticVisitor semanticVisitor = new SemanticVisitor();

        for (String file : files) {
            System.out.println("\n==============================");
            System.out.println("Parsing file: " + file);
            System.out.println("==============================");

            CharStream input = CharStreams.fromFileName(file);

            HtmlCssLexer lexer = new HtmlCssLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            HtmlCssParser parser = new HtmlCssParser(tokens);

            ParseTree tree = parser.document();

            JinjaVisitor astVisitor = new JinjaVisitor();
            Node ast = astVisitor.visit(tree);

            System.out.println("===== AST =====");
            System.out.println(ast);
            semanticVisitor.visit(tree);
        }

        System.out.println("\n\n===== FINAL SYMBOL TABLE =====");
        semanticVisitor.getSymbolTable().print();
    }
}
