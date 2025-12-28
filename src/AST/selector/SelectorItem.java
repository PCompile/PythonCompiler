package AST.selector;


/**
 * واجهة مشتركة لكل العناصر المسموح تكون داخل SelectorPart:
 *   - TypeSelector
 *   - ClassSelector
 *   - IdSelector
 *   - PseudoSelector
 *   - Combinator
 *
 * الهدف منها هو توحيد الأنواع داخل SelectorPart بحيث ما يقبل إلا عناصر صحيحة خاصة بالـ selectors.
 */
public interface SelectorItem {
    /**
     * كل عنصر في الـ selector عنده سطر (line) في الكود الأصلي.
     */
    int getLine();

    /**
     * اسم العقدة (Node name) مثل "TypeSelector" أو "ClassSelector".
     */
    String getNodeName();

    /**
     * تمثيل نصي للعنصر (يُستخدم عند الطباعة).
     */
    @Override
    String toString();
}
