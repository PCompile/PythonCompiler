package AST;

import java.util.ArrayList;
import java.util.List;

//// property: value; أو --variable: value;
//css_decl
//    : CSS_VAR COLON_CSS css_value SEMI_CSS?   #cssVariableDeclaration
//    | IDENT   COLON_CSS css_value SEMI_CSS?   #cssPropertyDeclaration
//    ;
public class CssDeclaration extends CssNode {
    public String property;
    public List<CssValue> values = new ArrayList<>();

    public CssDeclaration(int line, int column, String property) {
        super(line, column);
        this.property = property;
    }
}
