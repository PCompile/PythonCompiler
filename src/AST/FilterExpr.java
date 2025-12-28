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
        StringBuilder sb = new StringBuilder(getNodeName());
        sb.append("(base=").append(base.toString());
        if (!filters.isEmpty()) {
            sb.append(", filters=[");
            for (int i = 0; i < filters.size(); i++) {
                sb.append(filters.get(i).toString());
                if (i < filters.size() - 1) sb.append(", ");
            }
            sb.append("]");
        }
        sb.append(")");
        return sb.toString();
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
            if (args.isEmpty()) {
                return name + "()";
            }
            StringBuilder sb = new StringBuilder(name).append("(");
            for (int i = 0; i < args.size(); i++) {
                sb.append(args.get(i).toString());
                if (i < args.size() - 1) sb.append(", ");
            }
            sb.append(")");
            return sb.toString();
        }

    }
}
