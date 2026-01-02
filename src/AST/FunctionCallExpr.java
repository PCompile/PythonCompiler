package AST;

import java.util.ArrayList;
import java.util.List;

public class FunctionCallExpr extends Expr {
    private final String callee;
    private final List<Expr> args;

    public FunctionCallExpr(String callee, int line) {
        super(line, "FunctionCallExpr");
        this.callee = callee;
        this.args = new ArrayList<>();
    }

    public void addArg(Expr expr) { args.add(expr); }

    @Override
    public String toString() {
        return "FunctionCallExpr{" +
                "callee='" + callee + '\'' +
                ", args=" + args +
                ", nodeName='" + getNodeName() + '\'' +
                ", lineNumber=" + getLine() +
                '}';
    }
}
