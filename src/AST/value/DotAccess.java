package AST.value;

import AST.CssValue;

public class DotAccess extends CssValue {
    private final CssValue base;
    private final String property;

    public DotAccess(int line, CssValue base, String property) {
        super(line, "DotAccess");
        this.base = base;
        this.property = property;
    }

    public CssValue getBase() { return base; }
    public String getProperty() { return property; }

    @Override
    public String toString() {
        return base.toString() + "." + property;
    }
}
