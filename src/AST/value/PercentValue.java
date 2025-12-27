package AST.value;

import AST.CssValue;

public class PercentValue extends CssValue {
    private final String value;

    public PercentValue(int line, String value) {
        super(line, "PercentValue");
        this.value = value;
    }

    public String getValue() { return value; }

    @Override
    public String toString() {
        return value + "%";
    }
}
