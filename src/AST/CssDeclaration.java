package AST;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * يمثل التصريح داخل CSS:
 *   CSS_VAR : value ;   #cssVariableDeclaration
 *   IDENT   : value ;   #cssPropertyDeclaration
 */
public class CssDeclaration extends Node {
    private final String property;
    private final List<CssValue> values;

    public CssDeclaration(int line, String property) {
        super(line, "CssDeclaration");
        this.property = property;
        this.values = new ArrayList<>();
    }

    public void addValue(CssValue value) {
        values.add(value);
    }

    public String getProperty() { return property; }
    public List<CssValue> getValues() { return values; }

    @Override
    public String toString() {
        return property + ": " + values.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")) + ";";
    }


}
