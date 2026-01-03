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
    public String toString(int indent) {


        return getIndent(indent) + literal +
                "  <Type: " + type + ", Line: " + lineNumber + ">";
    }
}
