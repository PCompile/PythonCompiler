package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement extends Node {
    private final String tagName;
    private final List<Node> children;

    public HtmlElement(String tagName, int line) {
        super(line, "HtmlElement");
        this.tagName = tagName;
        this.children = new ArrayList<>();
    }

    public String getTagName() { return tagName; }
    public void addChild(Node child) { children.add(child); }
    public List<Node> getChildren() { return children; }

    @Override
    public String toString() {
        return getNodeName() + "<" + tagName + "> " + children;
    }
}
