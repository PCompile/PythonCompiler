package AST;

public class LiteralExpr extends Expr {
    private final String value;

    public LiteralExpr( int line,String value) {
        super(line, "Literal");
        this.value = value;
    }

    @Override
    public String toString() {
        return "LiteralExpr{" +
                "value='" + value + '\'' +
                ", nodeName='" + getNodeName() + '\'' +
                ", lineNumber=" + getLine() +
                '}';
    }
}
