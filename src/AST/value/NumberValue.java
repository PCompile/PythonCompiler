package AST.value;

import AST.CssValue;

public class NumberValue extends CssValue {
    private final String value;

    public NumberValue(int line, String value) {
        super(line, "NumberValue");
        this.value = value;
    }

    public String getValue() { return value; }

    @Override
    public String toString() {
        return value;
    }
}
