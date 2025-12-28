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
    public String toString() {
        return "ControlState{" +
                "type='" + type + '\'' +
                ", lineNumber=" + lineNumber +
                ", nodeName='" + nodeName + '\'' +
                '}';
    }
}
