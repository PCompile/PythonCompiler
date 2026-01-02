package AST.value;

import AST.CssValue;

public class ParenValue extends CssValue {
    private final CssValue inner;

    public ParenValue(int line, CssValue inner) {
        super(line, "ParenValue");
        this.inner = inner;
    }

    public CssValue getInner() { return inner; }

    @Override
    public String toString() {
        return "ParenValue{" +
                "inner=" + inner +
                ", nodeName='" + getNodeName() + '\'' +
                ", lineNumber=" + getLine() +
                '}';
    }

}
