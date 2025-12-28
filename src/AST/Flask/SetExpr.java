package AST.Flask;

import java.util.ArrayList;
import java.util.List;

public class SetExpr extends Expression {
    List<Expression> elements;

    public SetExpr(int lineNumber) {
        super("SetExpr", lineNumber);
        this.elements = new ArrayList<>();
    }

    public void addElement(Expression expr) {
        elements.add(expr);
    }

    public List<Expression> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return "SetExpr{" +
                "elements=" + elements +
                ", nodeName='" + nodeName + '\'' +
                ", lineNumber=" + lineNumber +
                '}';
    }
}
