package AST.Flask;

public class VariableExpr extends Expression {
    String name;

    public VariableExpr(int lineNumber, String name) {
        super("VariableExpression", lineNumber);
        this.name = name;
    }

    @Override
    public String toString(int indent) {
        if (indent == 0) {
            return name;
        }

        return getIndent(indent) + name +
                "  <Node: " + nodeName + ", Line: " + lineNumber + ">";
    }
}
