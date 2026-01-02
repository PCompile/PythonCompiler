package AST;

import java.util.List;

public class JinjaElseIf {
    private final Node condition;
    private final List<Node> body;

    public JinjaElseIf(Node condition, List<Node> body) {
        this.condition = condition;
        this.body = body;
    }

    @Override
    public String toString() {
        return "JinjaElseIf{" +
                "condition=" + condition +
                ", body=" + body +
                '}';
    }

}
