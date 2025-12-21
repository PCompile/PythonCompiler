package AST.value;

import AST.CssValue;

public class StringValue extends CssValue {
    public String value;

    public StringValue(int line, int column, String value) {
        super(line, column);
        this.value = value;
    }
}
