package AST;

import java.util.ArrayList;
import java.util.List;

public class ListLiteralExpr extends Expr {
    private final List<Expr> elements;

    public ListLiteralExpr(int line) {
        super(line, "List");
        this.elements = new ArrayList<>();
    }

    public void addElement(Expr expr) { elements.add(expr); }

    @Override
    public String toString() {
        return getNodeName() + elements;
    }
}
