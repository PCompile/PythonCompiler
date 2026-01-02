package AST;

public class BinaryExpr extends Expr {
    private final String op;
    private final Expr left;
    private final Expr right;

    public BinaryExpr(String op, Expr left, Expr right, int line) {
        super(line, "BinaryExpr");
        this.op = op;
        this.left = left;
        this.right = right;
    }

    public String getOp() { return op; }
    public Expr getLeft() { return left; }
    public Expr getRight() { return right; }

    @Override
    public String toString() {
        return "BinaryExpr{" +
                "op='" + op + '\'' +
                ", left=" + left +
                ", right=" + right +
                ", nodeName='" + getNodeName() + '\'' +
                ", lineNumber=" + getLine() +
                '}';
    }
}
