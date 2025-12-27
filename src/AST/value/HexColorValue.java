package AST.value;

import AST.CssValue;

public class HexColorValue extends CssValue {
    private final String value;

    public HexColorValue(int line, String value) {
        super(line, "HexColorValue");
        this.value = value;
    }

    public String getValue() { return value; }

    @Override
    public String toString() {
        return value;
    }
}
