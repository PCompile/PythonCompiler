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
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();
        String currentIndent = getIndent(indent);

        sb.append(currentIndent).append("=== AST START (")
                .append(nodeName).append(") ===\n\n");

        for (Statement statement : statements) {
            sb.append(statement.toString(indent)).append("\n");
        }

        sb.append("\n").append(currentIndent).append("=== AST END ===");
        return sb.toString();
    }

    @Override
    public String toString() {
        return toString(0);
    }
}
