package AST.selector;

import AST.SimpleSelector;

/**
 * يمثل الـ pseudoClassSelector:
 *   COLON_CSS IDENT   #pseudoClassSelector
 */
public class PseudoSelector extends SimpleSelector implements SelectorItem {
    private final String pseudo;

    public PseudoSelector(int line, String pseudo) {
        super(line, "PseudoSelector");
        this.pseudo = pseudo;
    }

    public String getPseudo() { return pseudo; }

    @Override
    public String toString() {
        return getNodeName() + ":" + pseudo;
    }
}
