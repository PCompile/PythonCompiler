package AST.value;

import AST.CssValue;

public class IdentValue extends CssValue {
    public String value;

    public IdentValue(int line, int column, String value) {
        super(line, column);
        this.value = value;
    }
}
