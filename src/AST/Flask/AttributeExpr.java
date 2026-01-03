package AST.Flask;

public class AttributeExpr extends Expression {
     Expression base;
     String attribute;

    public AttributeExpr(int lineNumber, Expression base, String attribute) {
        super("AttributeExpr", lineNumber);
        this.base = base;
        this.attribute = attribute;
    }

    @Override
    public String toString(int indent) {
        return getIndent(indent) + base.toString(0) + "." + attribute +
                " (" + nodeName + ", L: " + lineNumber + ")";
    }
}
