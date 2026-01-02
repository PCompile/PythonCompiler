package AST.value;

import AST.CssValue;

public class StringValue extends CssValue {
    private final String value;

    public StringValue(int line, String value) {
        super(line, "StringValue");
        this.value = value;
    }

    public String getValue() { return value; }

    @Override
    public String toString() {
        return "StringValue{" +
                "value='" + value + '\'' +
                ", nodeName='" + getNodeName() + '\'' +
                ", lineNumber=" + getLine() +
                '}';
    }

}
