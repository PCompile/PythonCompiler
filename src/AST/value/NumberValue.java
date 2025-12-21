package AST.value;

import AST.CssValue;

public class NumberValue extends CssValue {
    public String value;

    public NumberValue(int line, int column, String value) {
        super(line, column);
        this.value = value;
    }
}
