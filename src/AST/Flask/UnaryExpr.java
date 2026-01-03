package AST.Flask;

public class UnaryExpr extends Expression {
    Expression expr;
    public UnaryExpr(int lineNumber, Expression expr){
        super("UnaryExpression",lineNumber);
        this.expr = expr;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();

        sb.append(getIndent(indent));

        sb.append("(").append(" ").append(expr.toString(0)).append(")");

        sb.append("  [Node: ").append(nodeName)
                .append(", Line: ").append(lineNumber).append("]");

        return sb.toString();
    }
}
