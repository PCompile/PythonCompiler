package AST.value;

import AST.CssValue;

public class VariableReference extends CssValue {
    public String name;

    public VariableReference(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }
}
