package AST.selector;

import AST.SimpleSelector;
//pseudo_selector
//    : COLON_CSS IDENT   #pseudoClassSelector
//    ;
public class PseudoSelector extends SimpleSelector {
    public String pseudo;

    public PseudoSelector(int line, int column, String pseudo) {
        super(line, column);
        this.pseudo = pseudo;
    }
}
