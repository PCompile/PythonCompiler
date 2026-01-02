package AST;

public class TextHtml extends Node {
    private final String text;

    public TextHtml(String text, int line) {
        super(line, "TextHtml");
        this.text = text;
    }

    public String getText() { return text; }

    @Override
    public String toString() {
        return "TextHtml{" +
                "text='" + text + '\'' +
                ", nodeName='" + getNodeName() + '\'' +
                ", lineNumber=" + getLine() +
                '}';
    }

}
