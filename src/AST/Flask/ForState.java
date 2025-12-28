package AST.Flask;

import java.util.ArrayList;
import java.util.List;

public class ForState extends CompoundState {
    String variableName;
    Expression iterable;
    List<Statement> ifBody = new ArrayList<>();
    ForState(int lineNumber,String variableName, Expression iterable){
        super("ForStatement",lineNumber);
        this.variableName = variableName;
        this.iterable = iterable;
    }

    public  void addIfBody(Statement statement){
        ifBody.add(statement);
    }

    @Override
    public String toString() {
        return "ForState{" +
                "variableName='" + variableName + '\'' +
                ", iterable=" + iterable +
                ", body=" + ifBody +
                ", nodeName='" + nodeName + '\'' +
                ", lineNumber=" + lineNumber +
                '}';
    }
}
