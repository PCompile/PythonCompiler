package AST;

public class JinjaSet extends Node {
    private final String name;
    private final Node value;

    public JinjaSet(int line, String name, Node value) {
        super(line, "JinjaSet");
        this.name = name;
        this.value = value;
    }

    public String getName() { return name; }
    public Node getValue() { return value; }

    @Override
    public String toString() {
        return "{% set " + name + " = " + value + " %}";
    }
}
