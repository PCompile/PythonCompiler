package AST.selector;

import AST.SimpleSelector;

/**
 * يمثل الـ classSelector:
 *   DOTCSS IDENT   #classSelector
 */
public class ClassSelector extends SimpleSelector implements SelectorItem{
    private final String className;

    public ClassSelector(int line, String className) {
        super(line, "ClassSelector");
        this.className = className;
    }

    public String getClassName() { return className; }

    @Override
    public String toString() {
        return getNodeName() + "." + className;
    }
}
