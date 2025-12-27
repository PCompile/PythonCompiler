package AST.value;

import AST.CssValue;
import java.util.ArrayList;
import java.util.List;

/**
 * يمثل استدعاء دالة في CSS مثل:
 *   var(--x)
 *   rgba(255, 0, 0, 0.5)
 */
public class FunctionCallValue extends CssValue {
    private final String functionName;
    private final List<CssValue> arguments;

    public FunctionCallValue(int line, String functionName) {
        super(line, "FunctionCallValue");
        this.functionName = functionName;
        this.arguments = new ArrayList<>();
    }

    public String getFunctionName() { return functionName; }
    public List<CssValue> getArguments() { return arguments; }

    public void addArgument(CssValue arg) {
        arguments.add(arg);
    }

    @Override
    public String toString() {
        return functionName + "(" + arguments + ")";
    }
}
