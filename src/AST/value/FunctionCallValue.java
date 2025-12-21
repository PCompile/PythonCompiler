package AST.value;

import AST.CssValue;

import java.util.ArrayList;
import java.util.List;
//var(--x)
//rgba(...)
public class FunctionCallValue extends CssValue {
    public String functionName;
    public List<CssValue> arguments = new ArrayList<>();

    public FunctionCallValue(int line, int column, String functionName) {
        super(line, column);
        this.functionName = functionName;
    }
}
