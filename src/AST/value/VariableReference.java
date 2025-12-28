package AST.value;

import AST.CssValue;

public class VariableReference extends CssValue {
    private final String name;

    public VariableReference(int line, String name) {
        super( line,"VariableReference");
        this.name = name;
    }

    public String getName() { return name; }

    @Override
    public String toString() {
        return "var(" + name + ")";
    }
}
