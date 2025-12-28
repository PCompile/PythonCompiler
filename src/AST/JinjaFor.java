package AST;

import java.util.List;

public class JinjaFor extends Node {
    private final String varName;
    private final Node iterable;
    private final List<Node> body;
    private Node ifCondition; // الشرط الاختياري داخل الـ for

    public JinjaFor(int line, String varName, Node iterable, List<Node> body) {
        super(line, "JinjaFor");
        this.varName = varName;
        this.iterable = iterable;
        this.body = body;
        this.ifCondition = null;
    }

    public void setIfCondition(Node condition) {
        this.ifCondition = condition;
    }

    public Node getIfCondition() {
        return ifCondition;
    }

    public String getVarName() {
        return varName;
    }

    public Node getIterable() {
        return iterable;
    }

    public List<Node> getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "JinjaFor(var=" + varName +
                ", iterable=" + iterable +
                ", body=" + body +
                (ifCondition != null ? ", if=" + ifCondition : "") +
                ")";
    }
}
