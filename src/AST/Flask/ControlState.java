package AST.Flask;

public class ControlState extends SimpleState {
    String type;
    public ControlState(int lineNumber, String type){
        super(type,lineNumber);
        this.type = type;
    }
    public String  getType() {
        return type;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();

        sb.append(getIndent(indent));

        sb.append(type.toUpperCase());

        sb.append("  [Node: ").append(nodeName)
                .append(", Line: ").append(lineNumber).append("]");

        return sb.toString();
    }
}
