package AST;

public class TestAST {
    public static void main(String[] args) {

        LiteralExpr three = new LiteralExpr(1, "3");

        IdentifierExpr x = new IdentifierExpr(1, "x");

        BinaryExpr expr = new BinaryExpr("+", three, x, 1);

        System.out.println(expr);
    }
}
