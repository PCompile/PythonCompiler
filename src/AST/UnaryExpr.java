package AST;

public class UnaryExpr extends Expr {
    private final String op;
    private final Expr expr;

    public UnaryExpr(String op, Expr expr, int line, int column) {
        super(line,"Unary");
        this.op = op;
        this.expr = expr;
    }

    public String getOp() { return op; }
    public Expr getExpr() { return expr; }

    @Override
    public String toString() {
        return getNodeName()+"(" + op + ", " + expr + ")";
    }
}
