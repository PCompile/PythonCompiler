package AST.value;

import AST.CssValue;

public class IndexAccess extends CssValue {
    private final CssValue base;
    private final CssValue index;

    public IndexAccess(int line, CssValue base, CssValue index) {
        super(line, "IndexAccess");
        this.base = base;
        this.index = index;
    }

    public CssValue getBase() { return base; }
    public CssValue getIndex() { return index; }

    @Override
    public String toString() {
        return base.toString() + "[" + index.toString() + "]";
    }
}
