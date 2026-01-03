package AST.Flask;

import java.util.List;

public class ClassState extends CompoundState {
    String className;
    String parentClass;
    List<Statement> bodyClass;

    public ClassState(int lineNumber, String className, String parentClass) {
        super("ClassStatement", lineNumber);
        this.className = className;
        this.parentClass = parentClass;
    }
    public void addBodyClass(Statement stmt) {
        bodyClass.add(stmt);
    }
    public String getClassName() {
        return className;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();
        String currentIndent = getIndent(indent);

        sb.append(currentIndent).append("CLASS ").append(className);

        if (parentClass != null && !parentClass.isEmpty()) {
            sb.append("(").append(parentClass).append(")");
        }

        sb.append(":")
                .append("  <").append(nodeName).append(", Line: ").append(lineNumber).append(">\n");

        if (bodyClass.isEmpty()) {
            sb.append(getIndent(indent + 1)).append("pass\n");
        } else {
            for (Statement stmt : bodyClass) {
                sb.append(stmt.toString(indent + 1)).append("\n");
            }
        }

        return sb.toString();
    }
}
