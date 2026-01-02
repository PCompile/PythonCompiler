package AST;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;

public class HtmlElement extends Node {
    private final String tagName;
    private final List<Node> children;
    private final Map<String, String> attributes; // خزن الـ attributes

    public HtmlElement(String tagName, int line) {
        super(line, "HtmlElement");
        this.tagName = tagName;
        this.children = new ArrayList<>();
        this.attributes = new LinkedHashMap<>();
    }

    public String getTagName() { return tagName; }
    public void addChild(Node child) { children.add(child); }
    public List<Node> getChildren() { return children; }

    public void addAttribute(String name, String value) {
        attributes.put(name, value);
    }

    public Map<String, String> getAttributes() { return attributes; }

    @Override
    public String toString() {
        return "HtmlElement{" +
                "tagName='" + tagName + '\'' +
                ", attributes=" + attributes +
                ", children=" + children +
                ", nodeName='" + getNodeName() + '\'' +
                ", lineNumber=" + getLine() +
                '}';
    }

}
