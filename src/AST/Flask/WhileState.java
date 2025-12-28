package AST.Flask;

import java.util.ArrayList;
import java.util.List;

public class WhileState extends CompoundState {
    Expression condition;
    List<Statement> whileBody = new ArrayList<>();
    public WhileState(int lineNumber,Expression condition) {
        super("WhileStatement",lineNumber);
        this.condition = condition;
        whileBody = new ArrayList<>();
    }

    void addWhileBody(Statement statement){
        whileBody.add(statement);
    }

    @Override
    public String toString() {
        return "WhileState{" +
                "condition=" + condition +
                ", body=" + whileBody +
                ", nodeName='" + nodeName + '\'' +
                ", lineNumber=" + lineNumber +
                '}';
    }
}
