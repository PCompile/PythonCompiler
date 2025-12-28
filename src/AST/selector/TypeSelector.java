package AST.selector;

import AST.SimpleSelector;

/**
 * يمثل الـ typeSelector:
 *   IDENT   #typeSelector
 */
public class TypeSelector extends SimpleSelector implements SelectorItem {
    private final String name;

    public TypeSelector(int line, String name) {
        super(line, "TypeSelector");
        this.name = name;
    }

    public String getName() { return name; }

    @Override
    public String toString() {
        return getNodeName() + " " + name;
    }
}
