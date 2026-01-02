package AST;

public class JinjaExpr extends Node {
    private final Expr expr;
    public JinjaExpr(Expr expr, int line ){
        super(line,"JinjaExpr");
        this.expr=expr;
    }
    public Expr getExpr(){
        return expr;
    }

    @Override
    public String toString() {
        return "JinjaExpr{" +
                "expr=" + expr +
                ", nodeName='" + getNodeName() + '\'' +
                ", lineNumber=" + getLine() +
                '}';
    }
}
