package AST;
//css_value
//    : css_value_atom+   #cssValueSequence
//    ;
public abstract class CssValue extends CssNode {
    public CssValue(int line, int column) {
        super(line, column);
    }
}
