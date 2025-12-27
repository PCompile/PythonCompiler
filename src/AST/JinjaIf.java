package AST;

import java.util.List;

public class JinjaIf extends Node {
    private final Node condition;
    private final List<Node> body;

    public JinjaIf(int line, Node condition, List<Node> body) {
        super(line, "JinjaIf");
        this.condition = condition;
        this.body = body;
    }

    public Node getCondition() { return condition; }
    public List<Node> getBody() { return body; }

    @Override
    public String toString() {
        return "{% if " + condition + " %} ... {% endif %}";
    }
}
