package AST;

public class TextHtml extends Node {
    private final String text;

    public TextHtml(String text, int line, int column) {
        super(line, "TextHtml");
        this.text = text;
    }

    public String getText() { return text; }

    @Override
    public String toString() {
        return getNodeName() + "{ \"" + text + "\" }";
    }
}
