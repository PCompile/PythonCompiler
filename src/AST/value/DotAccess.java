package AST.value;

import AST.Expr;

public class DotAccess extends Expr {
    private final Expr base;
    private final String property;

    public DotAccess(int line, Expr base, String property) {
        super(line, "DotAccess");
        this.base = base;
        this.property = property;
    }

    public Expr getBase() { return base; }
    public String getProperty() { return property; }

    @Override
    public String toString() {
        return getNodeName() + "(" + base.toString() + ", \"" + property + "\")";
    }

}
