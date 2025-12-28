package AST.value;

import AST.CssValue;

public class CommaSeparator extends CssValue {
    public CommaSeparator(int line) {
        super(line, "CommaSeparator");
    }

    @Override
    public String toString() {
        return ",";
    }
}
