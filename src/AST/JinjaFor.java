package AST;
import java.util.List;

public class JinjaFor extends Node {
    private final String variable;
    private final Node iterable;
    private final List<Node> body;

    public JinjaFor(int line, String variable, Node iterable, List<Node> body) {
        super(line, "JinjaFor");
        this.variable = variable;
        this.iterable = iterable;
        this.body = body;
    }

    public String getVariable() { return variable; }
    public Node getIterable() { return iterable; }
    public List<Node> getBody() { return body; }

    @Override
    public String toString() {
        return "{% for " + variable + " in " + iterable + " %} ... {% endfor %}";
    }
}
