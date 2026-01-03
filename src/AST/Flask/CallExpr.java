package AST.Flask;

import java.util.ArrayList;
import java.util.List;

public class CallExpr extends Expression{
    Expression expr;
    List<Expression> args;

    public CallExpr(int lineNumber, Expression expr) {
        super("CallExpression", lineNumber);
        this.expr = expr;
        args=new ArrayList<>();
    }
    public  void addArg(Expression e){
        args.add(e);
    }
    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();

        sb.append(getIndent(indent));

        sb.append(expr.toString(0)).append("(");

        if(!args.isEmpty()) {
            for (int i = 0; i < args.size(); i++) {
                sb.append(args.get(i).toString(0));
                if (i < args.size() - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append(")");

        sb.append("  [Node: ").append(nodeName)
                .append(", Line: ").append(lineNumber).append("]");

        return sb.toString();
    }
}
