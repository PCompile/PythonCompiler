package AST.Flask;

import java.util.ArrayList;
import java.util.List;

public class ForState extends CompoundState {
    Expression variableName;
    Expression iterable;
    List<Statement> forBody = new ArrayList<>();
    public  ForState(int lineNumber,Expression variableName, Expression iterable){
        super("ForStatement",lineNumber);
        this.variableName = variableName;
        this.iterable = iterable;
    }

    public  void addForBody(Statement statement){
        forBody.add(statement);
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();
        String currentIndent = getIndent(indent);

        sb.append(currentIndent).append("FOR ")
                .append(variableName.toString(0))
                .append(" IN ")
                .append(iterable.toString(0))
                .append(":")
                .append("  <").append(nodeName).append(", Line: ").append(lineNumber).append(">\n");

        if (forBody.isEmpty()) {
            sb.append(getIndent(indent + 1)).append("pass\n");
        } else {
            for (Statement stmt : forBody) {
                sb.append(stmt.toString(indent + 1)).append("\n");
            }
        }

        return sb.toString();
    }
}
