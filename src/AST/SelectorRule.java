package AST;

import java.util.ArrayList;
import java.util.List;

public class SelectorRule extends CssRule {
    public Selector selector;
    public List<CssDeclaration> declarations = new ArrayList<>();

    public SelectorRule(int line, int column) {
        super(line, column);
    }
}
