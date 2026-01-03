package AST.Flask;

public class BinaryExpr extends Expression{
    Expression left;
    Expression right;
    String operator;
    public BinaryExpr(int lineNumber, String operator,Expression left, Expression right) {
        super("BinaryExpression",lineNumber);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public String toString(int indent) {
        return getIndent(indent) + "(" + left.toString(0) + " " + operator + " " + right.toString(0) + ")" +
                " [" + nodeName + ", Line: " + lineNumber + "]";
    }
}
