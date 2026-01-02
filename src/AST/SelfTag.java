package AST;

import java.util.LinkedHashMap;
import java.util.Map;

public class SelfTag extends Node {
    private final String tagName;
    private final Map<String, Object> attributes = new LinkedHashMap<>();

    public SelfTag(String tagName, int line) {
        super(line, "SelfTag");
        this.tagName = tagName;
    }

    public String getTagName() { return tagName; }

    public void addAttribute(String key, Object value) { attributes.put(key, value); }
    @Override
    public String toString() {
        return "SelfTag{" +
                "tagName='" + tagName + '\'' +
                ", nodeName='" + getNodeName() + '\'' +
                ", attributes=" + attributes +
                ", lineNumber=" + getLine() +
                '}';
    }

}
