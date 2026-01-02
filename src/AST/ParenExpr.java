package AST;

public class ParenExpr extends Expr {
    private final Expr inner;

    public ParenExpr(int line, Expr inner) {
        super(line, "ParenExpr");
        this.inner = inner;
    }

    public Expr getInner() {
        return inner;
    }
    @Override
    public String toString() {
        return "ParenExpr{" +
                "inner=" + inner +
                ", nodeName='" + getNodeName() + '\'' +
                ", lineNumber=" + getLine() +
                '}';
    }

}
