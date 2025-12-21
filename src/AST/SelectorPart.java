package AST;

import java.util.ArrayList;
import java.util.List;
// : simple_selector (simple_selector | combinator simple_selector)*   #selectorSequence
//    ;
public class SelectorPart extends CssNode {
    public List<Node> items = new ArrayList<>();
    // SimpleSelector أو Combinator

    public SelectorPart(int line, int column) {
        super(line, column);
    }
}
