import AST.Node;
import Visitor.JinjaVisitor;
import Visitor.SemanticVisitor;
import antlr.HtmlCssLexer;
import antlr.HtmlCssParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // الملفات التي نريد تحليلها
        String[] files = {
                "templates/list.html",
                "templates/add.html",
                "templates/details.html"
        };

        // نفس الـ SemanticVisitor لكل الملفات
        SemanticVisitor semanticVisitor = new SemanticVisitor();

        for (String file : files) {
            System.out.println("\n==============================");
            System.out.println("Parsing file: " + file);
            System.out.println("==============================");

            // 1️⃣ اقرأ الملف
            CharStream input = CharStreams.fromFileName(file);

            // 2️⃣ Lexer & Parser
            HtmlCssLexer lexer = new HtmlCssLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            HtmlCssParser parser = new HtmlCssParser(tokens);

            // 3️⃣ Parse Tree
            ParseTree tree = parser.document();

            // 4️⃣ AST Visitor
            JinjaVisitor astVisitor = new JinjaVisitor();
            Node ast = astVisitor.visit(tree);

            // 5️⃣ طباعة AST
            System.out.println("===== AST =====");
            System.out.println(ast);

            // 6️⃣ Semantic Visitor (يجمع الرموز)
            semanticVisitor.visit(tree);
        }

        // 7️⃣ بعد الانتهاء من كل الملفات → اطبع جدول الرموز النهائي
        System.out.println("\n\n===== FINAL SYMBOL TABLE =====");
        semanticVisitor.getSymbolTable().print();
    }
}
