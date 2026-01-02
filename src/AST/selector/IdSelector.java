package AST.selector;

import AST.SimpleSelector;

/**
 * يمثل الـ idSelector:
 *   HASH IDENT   #idSelector
 */
public class IdSelector extends SimpleSelector implements SelectorItem{
    private final String id;

    public IdSelector(int line, String id) {
        super(line, "IdSelector");
        this.id = id;
    }

    public String getId() { return id; }

    @Override
    public String toString() {
        return "IdSelector{" +
                "id='" + id + '\'' +
                ", nodeName='" + getNodeName() + '\'' +
                ", lineNumber=" + getLine() +
                '}';
    }
}
