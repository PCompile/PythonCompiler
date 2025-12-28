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
    public String toString() {
        return "AttributeExpr{" +
                "base=" + base +
                ", attribute='" + attribute + '\'' +
                ", nodeName='" + nodeName + '\'' +
                ", lineNumber=" + lineNumber +
                '}';
    }
}
