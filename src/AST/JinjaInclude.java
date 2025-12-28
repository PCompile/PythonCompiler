package AST;

public class JinjaInclude extends Node {
    private final String file;

    public JinjaInclude(int line, String file) {
        super(line, "JinjaInclude");
        this.file = file;
    }

    public String getFile() { return file; }

    @Override
    public String toString() {
        return "{% include \"" + file + "\" %}";
    }
}
