package AST;
import java.util.List;

public class JinjaMacro extends Node {
    private final String name;
    private final List<String> params;
    private final List<Node> body;

    public JinjaMacro(int line, String name, List<String> params, List<Node> body) {
        super(line, "JinjaMacro");
        this.name = name;
        this.params = params;
        this.body = body;
    }

    public String getName() { return name; }
    public List<String> getParams() { return params; }
    public List<Node> getBody() { return body; }

    @Override
    public String toString() {
        return "{% macro " + name + "(" + String.join(", ", params) + ") %} ... {% endmacro %}";
    }
}
