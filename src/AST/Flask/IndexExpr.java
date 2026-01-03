package AST.Flask;

public class IndexExpr extends Expression {
     Expression base;
     Expression index;

    public IndexExpr(int lineNumber, Expression base, Expression index) {
        super("IndexExpr", lineNumber);
        this.base = base;
        this.index = index;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();

        sb.append(getIndent(indent));

        sb.append(base.toString(0))
                .append("[")
                .append(index.toString(0))
                .append("]");

        sb.append("  (Node: ").append(nodeName)
                .append(", Line: ").append(lineNumber).append(")");

        return sb.toString();
    }
}
