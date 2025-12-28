package AST;

import java.util.ArrayList;

public class SelectorRule extends CssRule {

    // نبنيه مع الـ selector مباشرة ونبدأ بقائمة تصريحات فاضية
    public SelectorRule(int line, Selector selector) {
        super(line, selector, new ArrayList<>());
    }

    // أضيفي التصريحات إلى القائمة التابعة للقاعدة الأم
    public void addDeclaration(CssDeclaration decl) {
        declarations.add(decl); // أو getDeclarations().add(decl);
    }

    @Override
    public String toString() {
        return super.toString(); // body { background: url("bg.png"); }
    }
}
