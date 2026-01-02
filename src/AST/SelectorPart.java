package AST;

import AST.selector.SelectorItem;

import java.util.ArrayList;
import java.util.List;

/**
 * يمثل جزء من الـ selector:
 *   simple_selector (simple_selector | combinator simple_selector)*   #selectorSequence
 */
public class SelectorPart extends Node {
    private final List<SelectorItem> items; // ممكن تكون SimpleSelector أو Combinator

    public SelectorPart(int line) {
        super(line, "SelectorPart");
        this.items = new ArrayList<>();
    }

    public void addItem(SelectorItem item) {
        items.add(item);
    }

    public List<SelectorItem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "SelectorPart{" +
                "items=" + items +
                ", nodeName='" + getNodeName() + '\'' +
                ", lineNumber=" + getLine() +
                '}';
    }
}
