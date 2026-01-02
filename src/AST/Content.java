package AST;

import java.util.ArrayList;
import java.util.List;

public class Content extends Node {
    private final List<Node> children;

    public Content(int line) {
        super(line, "Content");
        this.children = new ArrayList<>();
    }

    public void addChild(Node child) { children.add(child); }
    public List<Node> getChildren() { return children; }

    @Override
    public String toString() {
        return "Content{" +
                "children=" + children +
                ", nodeName='" + getNodeName() + '\'' +
                ", lineNumber=" + getLine() +
                '}';
    }
}
