package AST.Flask;

import java.util.ArrayList;
import java.util.List;

public class ElifPart extends CompoundState{
    Expression condition;
    List<Node> elIfBody;
    public ElifPart(int lineNumber,Expression condition) {
        super("ElIFStatement",lineNumber);
        this.condition = condition;
        this.elIfBody = new ArrayList<>();
    }
    public  void addELIFBody(Node stmt){
        elIfBody.add(stmt);
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();
        String currentIndent = getIndent(indent);

        sb.append(currentIndent).append("ELIF (").append(condition.toString(0)).append("):\n");

        for (Node stmt : elIfBody) {
            sb.append(stmt.toString(indent + 1)).append("\n");
        }

        return sb.toString();
    }
}
