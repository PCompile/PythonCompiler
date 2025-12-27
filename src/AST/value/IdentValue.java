package AST.value;

import AST.CssValue;

public class IdentValue extends CssValue {
    private final String value;

    public IdentValue(int line, String value) {
        super(line, "IdentValue");
        this.value = value;
    }

    public String getValue() { return value; }

    @Override
    public String toString() {
        return value;
    }
}
