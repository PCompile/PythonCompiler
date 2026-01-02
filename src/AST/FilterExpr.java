package AST;


import java.util.ArrayList;
import java.util.List;

public class FilterExpr extends Expr {
    private final Expr base;
    private final List<FilterCall> filters;

    public FilterExpr(int line, Expr base) {
        super(line, "FilterExpr");
        this.base = base;
        this.filters = new ArrayList<>();
    }

    public void addFilter(String name, List<Expr> args) {
        filters.add(new FilterCall(name, args));
    }

    public Expr getBase() { return base; }
    public List<FilterCall> getFilters() { return filters; }

    @Override
    public String toString() {
        return "FilterExpr{" +
                "base=" + base +
                ", filters=" + filters +
                ", nodeName='" + getNodeName() + '\'' +
                ", lineNumber=" + getLine() +
                '}';
    }




    public static class FilterCall {
        private final String name;
        private final List<Expr> args;

        public FilterCall(String name, List<Expr> args) {
            this.name = name;
            this.args = args;
        }

        @Override
        public String toString() {
            return "FilterCall{" +
                    "name='" + name + '\'' +
                    ", args=" + args +
                    '}';
        }


    }
}
