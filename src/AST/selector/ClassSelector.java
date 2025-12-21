package AST.selector;

import AST.SimpleSelector;
//class_selector
//    : DOTCSS IDENT   #classSelector
//    ;
public class ClassSelector extends SimpleSelector {
    public String className;

    public ClassSelector(int line, int column, String className) {
        super(line, column);
        this.className = className;
    }
}
