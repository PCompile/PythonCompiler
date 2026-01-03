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
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();

        sb.append(getIndent(indent));

        sb.append("{");

        for (int i = 0; i < elements.size(); i++) {
            sb.append(elements.get(i).toString(0));
            if (i < elements.size() - 1) {
                sb.append(", ");
            }
        }

        sb.append("}  (Node: ").append(nodeName)
                .append(", Line: ").append(lineNumber).append(")");

        return sb.toString();
    }
}
