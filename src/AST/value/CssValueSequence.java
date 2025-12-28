package AST.value;

import AST.CssValue;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CssValueSequence extends CssValue {
    private final List<CssValue> values = new ArrayList<>();

    public CssValueSequence(int line) {
        super(line, "CssValueSequence");
    }

    public void addValue(CssValue value) {
        values.add(value);
    }

    public List<CssValue> getValues() {
        return values;
    }
    @Override public String toString() { return values.stream() .map(Object::toString) .collect(Collectors.joining(" ")); }

}
