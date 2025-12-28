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
    public String toString() {
        return "AssignState{" +
                "identifier=" + target +
                ", value=" + value +
                ", nodeName='" + nodeName + '\'' +
                ", lineNumber=" + lineNumber +
                ",operator='" + operator + '\'' +
                '}';
    }
}
