package AST;

import java.util.stream.Collectors;

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

   protected String indent(String text, int level) {
        String pad = " ".repeat(level);
        return text.lines() .map(line -> pad + line) .collect(Collectors.joining("\n"));
    }

    @Override
    public String toString() {
        return nodeName + " (line " + line + ")";
    }
}
