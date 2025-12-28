package AST.Flask;

import java.util.List;

public class ImportState extends Statement {
    List<String> Path;

    public ImportState(int lineNumber, List<String> Path) {
        super("ImportStatement", lineNumber);
        this.Path = Path;
    }

    public List<String> getModulePath() {
        return Path;
    }

    @Override
    public String toString() {
        return "ImportState{" +
                "Path=" + Path +
                ", nodeName='" + nodeName + '\'' +
                ", lineNumber=" + lineNumber +
                '}';
    }
}
