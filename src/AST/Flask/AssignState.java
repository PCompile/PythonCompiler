package AST.Flask;

public class AssignState extends SimpleState {
    Expression target;
    String operator;
    Expression value;
    public AssignState( int lineNumber,Expression identifier, Expression value) {
        super("AssignStatement", lineNumber);
        this.target = identifier;
        this.operator = "=";
        this.value = value;
    }

    public Expression getTarget() {
        return target;
    }

    public Expression getValue() {
        return value;
    }

    public String getOperator() {
        return operator;
    }


    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(getIndent(indent));

        String code = target.toString(0) + " " + operator + " " + value.toString(0);
        sb.append(code);

        sb.append("  [Node: ").append(nodeName)
                .append(", Line: ").append(lineNumber).append("]");

        return sb.toString();
    }
}
