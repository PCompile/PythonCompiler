package AST;

import AST.selector.SelectorItem;

/**
 * يمثل الـ combinator في CSS selectors:
 *   الرموز الممكنة: > + ~
 */
public class Combinator extends Node implements SelectorItem {
    private final String symbol;

    public Combinator(int line, String symbol) {
        super(line, "Combinator");
        this.symbol = symbol;
    }

    public String getSymbol() { return symbol; }

    @Override
    public String toString() {
        return "Combinator{" +
                "symbol='" + symbol + '\'' +
                ", nodeName='" + getNodeName() + '\'' +
                ", lineNumber=" + getLine() +
                '}';
    }
}
