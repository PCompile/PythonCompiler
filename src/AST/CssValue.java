package AST;

/**
 * يمثل قيمة CSS:
 *   css_value : css_value_atom+   #cssValueSequence
 */
public abstract class CssValue extends Node {
    public CssValue(int line, String variableReference) {
        super(line, "CssValue");
    }
}
