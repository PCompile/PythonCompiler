package AST.Flask;

import java.util.ArrayList;
import java.util.List;

public class CallExpr extends Expression{
    Expression expr;
    List<Expression> args;

    public CallExpr(int lineNumber, Expression expr, List<Expression> args) {
        super("CallExpression", lineNumber);
        this.expr = expr;
        this.args = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "CallExpr{" +
                "expr=" + expr +
                ", args=" + args +
                ", nodeName='" + nodeName + '\'' +
                ", lineNumber=" + lineNumber +
                '}';
    }
}
