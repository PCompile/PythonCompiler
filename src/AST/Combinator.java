package AST;

public class Combinator extends CssNode {
    public String symbol; // > + ~

    public Combinator(int line, int column, String symbol) {
        super(line, column);
        this.symbol = symbol;
    }
}
