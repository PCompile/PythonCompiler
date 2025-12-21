package AST;

import java.util.ArrayList;
import java.util.List;
//style_element : STYLE_OPEN css_rules STYLE_CLOSE_CSS ;
public class StyleBlock extends CssNode {
    public List<CssRule> rules = new ArrayList<>();

    public StyleBlock(int line, int column) {
        super(line, column);
    }
}
