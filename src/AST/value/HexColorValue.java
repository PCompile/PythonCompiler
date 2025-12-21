package AST.value;

import AST.CssValue;

public class HexColorValue extends CssValue {
    public String value;

    public HexColorValue(int line, int column, String value) {
        super(line, column);
        this.value = value;
    }
}
