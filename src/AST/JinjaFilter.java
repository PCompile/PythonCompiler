package AST;
import java.util.List;

public class JinjaFilter extends Node {
    private final String name;
    private final List<Node> body;

    public JinjaFilter(int line, String name, List<Node> body) {
        super(line, "JinjaFilter");
        this.name = name;
        this.body = body;
    }

    public String getName() { return name; }
    public List<Node> getBody() { return body; }

    @Override
    public String toString() {
        return "{% filter " + name + " %} ... {% endfilter %}";
    }
}
