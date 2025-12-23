package AST;

public class IdentifierExpr extends Expr {
    private final String name;

    public IdentifierExpr( int line,String name) {
        super(line, "Identifier");
        this.name = name;
    }

    @Override
    public String toString() {
        return getNodeName() + "(" + name + ")";
    }
}
