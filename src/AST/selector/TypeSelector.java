package AST.selector;

import AST.SimpleSelector;

public class TypeSelector extends SimpleSelector {
    public String name;

    public TypeSelector(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }
}
