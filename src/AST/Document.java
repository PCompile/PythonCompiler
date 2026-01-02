package AST;

import java.util.ArrayList;
import java.util.List;

public class Document extends Node {
    private final List<Node> children;

    public Document(int line) {
        super(line, "Document");
        this.children = new ArrayList<>();
    }

    public void addChild(Node child) {
        children.add(child);
    }

    public List<Node> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "Document{" +
                "children=" + children +
                ", nodeName='" + getNodeName() + '\'' +
                ", lineNumber=" + getLine() +
                '}';
    }


}
