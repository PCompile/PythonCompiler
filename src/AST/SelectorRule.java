package AST;

import java.util.ArrayList;
import java.util.List;

/**
 * يمثل قاعدة CSS من نوع selector:
 * selector { ...declarations... }
 */
public class SelectorRule extends CssRule {
    private Selector selector;
    private final List<CssDeclaration> declarations;

    public SelectorRule(int line) {
        super(line, "SelectorRule");
        this.declarations = new ArrayList<>();
    }

    public void setSelector(Selector selector) {
        this.selector = selector;
    }

    public Selector getSelector() {
        return selector;
    }

    public void addDeclaration(CssDeclaration decl) {
        declarations.add(decl);
    }

    public List<CssDeclaration> getDeclarations() {
        return declarations;
    }

    @Override
    public String toString() {
        return getNodeName() + " [" + selector + "] " + declarations;
    }
}
