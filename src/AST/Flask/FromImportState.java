package AST.Flask;

import java.util.ArrayList;
import java.util.List;

public class FromImportState extends Statement {
     String path;
     List<String> names;

    public FromImportState(int lineNumber,String path) {
        super("FromImportStatement", lineNumber);
        this.path = path;
        this.names = new  ArrayList<>();
    }

    public void addName(String name) {
        names.add(name);
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();

        sb.append(getIndent(indent));

        sb.append("FROM ").append(path)
                .append(" IMPORT ").append(String.join(", ", names));

        sb.append("  [Node: ").append(nodeName)
                .append(", Line: ").append(lineNumber).append("]");

        return sb.toString();
    }
}
