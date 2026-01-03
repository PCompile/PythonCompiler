package AST.Flask;

import java.util.ArrayList;
import java.util.List;

public class BlockState extends CompoundState {
    List<Statement> block=new ArrayList<>();
    public BlockState(int lineNumber) {
        super("Block", lineNumber);
    }

    public void addBlock(Statement node){
        block.add(node);
    }
    public List<Statement> getBlock() {
        return block;
    }
    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();
        String currentIndent = getIndent(indent);

        sb.append(currentIndent).append("BLOCK: ")
                .append("  <").append(nodeName).append(", Line: ").append(lineNumber).append(">\n");

        if (block.isEmpty()) {
            sb.append(getIndent(indent + 1)).append("(empty block)\n");
        } else {
            for (Statement node : block) {
                sb.append(node.toString(indent + 1)).append("\n");
            }
        }

        return sb.toString();
    }
}
