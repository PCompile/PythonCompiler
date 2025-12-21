package AST;

import java.util.ArrayList;
import java.util.List;
//| selector LBRACE_CSS css_body RBRACE_CSS   #selectorRule
public class Selector extends CssNode {
    public List<SelectorPart> parts = new ArrayList<>();

    public Selector(int line, int column) {
        super(line, column);
    }
}
