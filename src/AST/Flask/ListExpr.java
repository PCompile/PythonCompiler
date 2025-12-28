package AST.Flask;

import java.util.ArrayList;
import java.util.List;

public class ListExpr extends Expression {
    List<Expression> elements;

    public ListExpr(int lineNumber) {
        super("ListExpr", lineNumber);
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
        return "ListExpr{" +
                "elements=" + elements +
                ", nodeName='" + nodeName + '\'' +
                ", lineNumber=" + lineNumber +
                '}';
    }
}
