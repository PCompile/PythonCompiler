package AST.Flask;

public class UnaryExpr extends Expression {
    Expression expr;
    String operator;
    UnaryExpr(int lineNumber,Expression expr, String operator){
        super("UnaryExpression",lineNumber);
        this.expr = expr;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "UnaryExpr{" +
                "expr=" + expr +
                ", operator='" + operator + '\'' +
                ", nodeName='" + nodeName + '\'' +
                ", lineNumber=" + lineNumber +
                '}';
    }
}
