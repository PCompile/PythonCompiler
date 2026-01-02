package AST.value;

import AST.Expr;

public class IndexAccess extends Expr {
    private final Expr base;
    private final Expr index;

    public IndexAccess(int line, Expr base, Expr index) {
        super(line, "IndexAccess");
        this.base = base;
        this.index = index;
    }

    public Expr getBase() { return base; }
    public Expr getIndex() { return index; }

    @Override
    public String toString() {
        return "IndexAccess{" +
                "base=" + base +
                ", index=" + index +
                ", nodeName='" + getNodeName() + '\'' +
                ", lineNumber=" + getLine() +
                '}';
    }

}
