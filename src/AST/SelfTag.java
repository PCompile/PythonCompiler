package AST;

public class SelfTag extends Node {
    private final String tagName;

    public SelfTag(String tagName, int line) {
        super(line, "SelfTag");
        this.tagName = tagName;
    }

    public String getTagName() { return tagName; }

    @Override
    public String toString() {
        return getNodeName()+ "<" + tagName + ">";
    }
}
