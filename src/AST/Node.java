package AST;

public abstract class Node {
    protected int line;
    protected int column;

    public Node(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public int getLine() { return line; }
    public int getColumn() { return column; }

    public String getNodeName() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return getNodeName() + " [line=" + line + ", col=" + column + "]";
    }
}
