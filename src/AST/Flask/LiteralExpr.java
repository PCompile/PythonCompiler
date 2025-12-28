package AST.Flask;

public class LiteralExpr extends Expression {
    String literal;
    String type;
    public LiteralExpr(int lineNumber,String literal, String type){
        super("LiteralExpression",lineNumber);
        this.literal = literal;
        this.type = type;
    }

    @Override
    public String toString() {
        return "LiteralExpr{" +
                "literal='" + literal + '\'' +
                ", type='" + type + '\'' +
                ", nodeName='" + nodeName + '\'' +
                ", lineNumber=" + lineNumber +
                '}';
    }
}
