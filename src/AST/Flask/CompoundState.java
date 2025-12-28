package AST.Flask;

import java.util.ArrayList;
import java.util.List;

public abstract class CompoundState extends Statement {
    List<Statement> body;
    public CompoundState(String nodeName, int lineNumber) {
        super(nodeName, lineNumber);
        body = new ArrayList<>();
    }
    public List<Statement> getStatements() {
        return body;
    }

    public void addStatement(Statement stmt) {
        body.add(stmt);
    }

    public List<Statement> getBody() {
        return body;
    }

}
