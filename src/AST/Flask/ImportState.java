package AST.Flask;

import java.util.ArrayList;
import java.util.List;

public class ImportState extends Statement {
    List<String> Path;

    public ImportState(int lineNumber) {
        super("ImportStatement", lineNumber);
        this.Path = new ArrayList<String>();
    }
    public void addPath(String path) {
        Path.add(path);
    }
    public List<String> getModulePath() {
        return Path;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();

        sb.append(getIndent(indent));

        sb.append("IMPORT ");
        sb.append(String.join(", ", Path));

        sb.append("  [Node: ").append(nodeName)
                .append(", Line: ").append(lineNumber).append("]");

        return sb.toString();
    }
}
