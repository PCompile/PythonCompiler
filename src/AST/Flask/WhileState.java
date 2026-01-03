package AST.Flask;

import java.util.ArrayList;
import java.util.List;

public class WhileState extends CompoundState {
    Expression condition;
    List<Statement> whileBody ;
    public WhileState(int lineNumber,Expression condition) {
        super("WhileStatement",lineNumber);
        this.condition = condition;
        whileBody = new ArrayList<>();
    }

    public void addWhileBody(Statement statement){
        whileBody.add(statement);
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();
        String currentIndent = getIndent(indent);

        sb.append(currentIndent).append("WHILE (")
                .append(condition.toString(0))
                .append("):")
                .append("  <").append(nodeName).append(", Line: ").append(lineNumber).append(">\n");

        if (whileBody.isEmpty()) {
            sb.append(getIndent(indent + 1)).append("pass\n");
        } else {
            for (Statement stmt : whileBody) {
                sb.append(stmt.toString(indent + 1)).append("\n");
            }
        }

        return sb.toString();
    }
}
