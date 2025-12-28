package AST.Flask;

public class BinaryExpr extends Expression{
    Expression left;
    Expression right;
    String operator;
    public BinaryExpr(int lineNumber,Expression left, Expression right, String operator) {
        super("BinaryExpression",lineNumber);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "BinaryExpr{" +
                "left=" + left +
                ", right=" + right +
                ", operator='" + operator + '\'' +
                ", nodeName='" + nodeName + '\'' +
                ", lineNumber=" + lineNumber +
                '}';
    }
}
