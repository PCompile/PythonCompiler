package AST.Flask;

public class IndexExpr extends Expression {
     Expression base;
     Expression index;

    public IndexExpr(int lineNumber, Expression base, Expression index) {
        super("IndexExpr", lineNumber);
        this.base = base;
        this.index = index;
    }

    @Override
    public String toString() {
        return "IndexExpr{" +
                "base=" + base +
                ", index=" + index +
                ", nodeName='" + nodeName + '\'' +
                ", lineNumber=" + lineNumber +
                '}';
    }
}
