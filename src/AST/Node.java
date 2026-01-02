package AST;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Node {
    private final int line;
    private final String nodeName;
    private final List<Node> children = new ArrayList<>(); // 🟢 قائمة الأطفال

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
        StringBuilder sb = new StringBuilder();
        sb.append("Node{")
                .append("nodeName='").append(nodeName).append('\'')
                .append(", lineNumber=").append(line)
                .append("}\n");

        for (Node child : children) {
            // أضف مسافة قبل كل طفل ليتضح التشجير
            sb.append("  ").append(child.toString().replace("\n", "\n  "));
        }

        return sb.toString();
    }

}
