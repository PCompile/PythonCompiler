package AST;

public class JinjaExtends extends Node {
    private final String file;

    public JinjaExtends(int line, String file) {
        super(line, "JinjaExtends");
        this.file = file;
    }

    public String getFile() {
        return file;
    }

    @Override
    public String toString() {
        return "JinjaExtends{" +
                "file='" + file + '\'' +
                ", nodeName='" + getNodeName() + '\'' +
                ", lineNumber=" + getLine() +
                '}';
    }
}
