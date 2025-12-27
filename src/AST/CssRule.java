package AST;

/**
 * قاعدة مجردة لتمثيل أي CSS Rule.
 */
public abstract class CssRule extends Node {
    public CssRule(int line, String selectorRule) {
        super(line, "CssRule");
    }
}
