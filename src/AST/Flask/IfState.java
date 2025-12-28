package AST.Flask;

import java.util.ArrayList;
import java.util.List;

public class IfState extends CompoundState {
    Expression condition;
    List<Statement> ifBody = new ArrayList<>();
    List<ElifPart> elifParts;
    List<Statement> elseBody;
    public IfState(int lineNumber, Expression condition) {
        super("IFStatement",lineNumber);
        this.condition = condition;
        this.elseBody = new ArrayList<>();
        this.ifBody = new ArrayList<>();
        this.elifParts = new ArrayList<>();
    }

    public void addIFBody(Statement statement){
        ifBody.add(statement);
    }
    public void addElifPart(ElifPart elifPart){
        elifParts.add(elifPart);
    }
    public void addElseBody(Statement statement){
        elseBody.add(statement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("If ").append(condition).append("\n");
        for (Statement statement : ifBody) {
            sb.append(statement).append("\n");
        }
        for (ElifPart e : elifParts) {
            sb.append("\nElif ").append(e);
        }
        sb.append("\nElse:\n");
       for (Statement e : elseBody) {
           sb.append(e);
       }
        return sb.toString();
    }
}
