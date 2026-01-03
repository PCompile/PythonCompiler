package AST.Flask;

public class ReturnState extends SimpleState {
    Expression value;
    public ReturnState(int lineNumber,Expression value) {
        super("ReturnStatement",lineNumber);
        this.value = value;
    }
    public Expression getValue() {
        return value;
    }


    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();

        sb.append(getIndent(indent));

        sb.append("RETURN ");

        if (value != null) {
            sb.append(value.toString(0));
        } else {
            sb.append("None");
        }

        sb.append("  [Node: ").append(nodeName)
                .append(", Line: ").append(lineNumber).append("]");

        return sb.toString();
    }
}
