package AST.Flask;

import java.util.ArrayList;
import java.util.List;

public class Program extends Node {
    List<Statement> statements;
    public Program(int lineNumber) {
        super("Program", lineNumber);
        statements = new ArrayList<>();
    }
    public void addStatement(Statement statement) {
        statements.add(statement);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Statement statement : statements) {
            sb.append(statement.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
