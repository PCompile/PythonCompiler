package AST;

import java.util.ArrayList;
import java.util.List;

/**
 * يمثل بلوك الـ style في HTML:
 * style_element : STYLE_OPEN css_rules STYLE_CLOSE_CSS ;
 */
public class StyleBlock extends Node {
    private final List<CssRule> rules;

    public StyleBlock(int line) {
        super(line, "StyleBlock");
        this.rules = new ArrayList<>();
    }

    public void addRule(CssRule rule) {
        rules.add(rule);
    }

    public List<CssRule> getRules() {
        return rules;
    }

    @Override
    public String toString() {
        return "StyleBlock{" +
                "rules=" + rules +
                ", nodeName='" + getNodeName() + '\'' +
                ", lineNumber=" + getLine() +
                '}';
    }




}


