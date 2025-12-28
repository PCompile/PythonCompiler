package AST.Flask;

import java.util.List;

public class FromImportState extends Statement {
     List<String> Path;
     List<String> names;

    public FromImportState(int lineNumber, List<String> Path, List<String> names) {
        super("FromImportStatement", lineNumber);
        this.Path = Path;
        this.names = names;
    }

    @Override
    public String toString() {
        return "from " + String.join(".", Path) +
                " import " + String.join(", ", names);
    }
}
