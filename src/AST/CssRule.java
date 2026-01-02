package AST;

import java.util.List;
import java.util.stream.Collectors;

public abstract class CssRule extends Node {
    protected final Selector selector;
    protected final List<CssDeclaration> declarations;

    public CssRule(int line, Selector selector, List<CssDeclaration> declarations) {
        super(line, "CssRule");
        this.selector = selector;
        this.declarations = declarations;
    }

    public Selector getSelector() { return selector; }
    public List<CssDeclaration> getDeclarations() { return declarations; }

    @Override
    public String toString() {
        return "CssRule{" +
                "selector=" + selector +
                ", declarations=" + declarations +
                ", nodeName='" + getNodeName() + '\'' +
                ", lineNumber=" + getLine() +
                '}';
    }


}
