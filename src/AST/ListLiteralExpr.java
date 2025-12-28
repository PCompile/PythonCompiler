package AST;

import java.util.ArrayList;
import java.util.List;

public class ListLiteralExpr extends Expr {
    private final List<Expr> elements = new ArrayList<>();

    public ListLiteralExpr(int line) {
        super(line, "List");
    }

    public void addElement(Expr e) {
        if (e != null) elements.add(e);
    }

    public List<Expr> getElements() {
        return elements;
    }

    public int size() {
        return elements.size();
    }

    public Expr get(int i) {
        return elements.get(i);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("List[");
        for (int i = 0; i < elements.size(); i++) {
            sb.append(elements.get(i).toString());
            if (i < elements.size() - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
