package AST;
import java.util.List;

public class JinjaBlock extends Node {
    private final String name;
    private final List<Node> body;

    public JinjaBlock(int line, String name, List<Node> body) {
        super(line, "JinjaBlock");
        this.name = name;
        this.body = body;
    }

    public String getName() { return name; }
    public List<Node> getBody() { return body; }

    @Override
    public String toString() {
        return "{% block " + name + " %} " + body + " {% endblock %}";
    }

}
