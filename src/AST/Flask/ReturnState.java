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
    public String toString() {
        return "ReturnState{" +
                "value=" + value +
                ", nodeName='" + nodeName + '\'' +
                ", lineNumber=" + lineNumber +
                '}';
    }
}
