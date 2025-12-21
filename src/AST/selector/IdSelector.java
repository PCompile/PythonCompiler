package AST.selector;

import AST.SimpleSelector;
//id_selector
//    : HASH IDENT   #idSelector
//    ;
public class IdSelector extends SimpleSelector {
    public String id;

    public IdSelector(int line, int column, String id) {
        super(line, column);
        this.id = id;
    }
}
