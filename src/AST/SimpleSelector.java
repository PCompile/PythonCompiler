package AST;
//simple_selector
//    : IDENT?
//      (class_selector
//      | id_selector
//      | pseudo_selector)+   #complexSimpleSelector
//    | IDENT   #typeSelector
public abstract class SimpleSelector extends CssNode {
    public SimpleSelector(int line, int column) {
        super(line, column);
    }
}
