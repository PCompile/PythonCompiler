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
        StringBuilder sb = new StringBuilder();
        sb.append("HtmlElement<").append(tagName);
        if (!attributes.isEmpty()) {
            sb.append(" ").append(attributes);
        }
        sb.append(">\n");
        for (Node child : children) {
            sb.append(indent(child.toString(), 1)).append("\n");
        }
        return sb.toString();
    }

}
