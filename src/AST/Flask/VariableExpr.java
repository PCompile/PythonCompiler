package AST.Flask;

public class VariableExpr extends Expression {
    String name;

    public VariableExpr(int lineNumber, String name) {
        super("VariableExpression", lineNumber);
        this.name = name;
    }

    @Override
    public String toString() {
        return "VariableExpr{" +
                "name='" + name + '\'' +
                ", nodeName='" + nodeName + '\'' +
                ", lineNumber=" + lineNumber +
                '}';
    }
}
