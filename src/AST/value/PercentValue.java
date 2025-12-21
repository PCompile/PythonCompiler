package AST.value;

import AST.CssValue;

public class PercentValue extends CssValue {
    public String value;

    public PercentValue(int line, int column, String value) {
        super(line, column);
        this.value = value;
    }
}
