package AST;

/**
 * يمثل الـ simple_selector:
 *   IDENT? (class_selector | id_selector | pseudo_selector)+   #complexSimpleSelector
 *   | IDENT   #typeSelector
 */
public abstract class SimpleSelector extends Node {
    public SimpleSelector(int line, String typeSelector) {
        super(line, "SimpleSelector");

    }
}
