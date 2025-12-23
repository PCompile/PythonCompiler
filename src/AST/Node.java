package AST;

public abstract class Node {
    private final int line;
    private final String nodeName;

    public Node(int line, String nodeName) {
        this.line = line;
        this.nodeName = nodeName;
    }

    public int getLine() {
        return line;
    }

    public String getNodeName() {
        return nodeName;
    }

    @Override
    public String toString() {
        return nodeName + " (line " + line + ")";
    }
}
