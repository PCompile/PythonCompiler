package AST;

import java.util.ArrayList;
import java.util.List;

/**
 * يمثل قاعدة selector:
 *   selector LBRACE_CSS css_body RBRACE_CSS   #selectorRule
 */
public class Selector extends Node {
    private final List<SelectorPart> parts;

    public Selector(int line) {
        super(line, "Selector");
        this.parts = new ArrayList<>();
    }

    public void addPart(SelectorPart part) {
        parts.add(part);
    }

    public List<SelectorPart> getParts() {
        return parts;
    }

    @Override
    public String toString() {
        return "Selector{" +
                "parts=" + parts +
                ", nodeName='" + getNodeName() + '\'' +
                ", lineNumber=" + getLine() +
                '}';
    }
}
