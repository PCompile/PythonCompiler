package AST;

import java.util.List;

public class JinjaWith extends Node {
    private final String varName;
    private final Node value;
    private final List<Node> body;

    public JinjaWith(int line, String varName, Node value, List<Node> body) {
        super(line, "JinjaWith");
        this.varName = varName;
        this.value = value;
        this.body = body;
    }

    @Override
    public String toString() {
        return "JinjaWith{" +
                "varName='" + varName + '\'' +
                ", value=" + value +
                ", body=" + body +
                ", nodeName='" + getNodeName() + '\'' +
                ", lineNumber=" + getLine() +
                '}';
    }
}
