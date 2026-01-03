package AST.Flask;

import java.util.ArrayList;
import java.util.List;

public class IfState extends CompoundState {
    Expression condition;
    BlockState ifBlock;
    List<ElifPart> elifParts;
    BlockState elseBlock;
    public IfState(int lineNumber, Expression condition) {
        super("IFStatement",lineNumber);
        this.condition = condition;
        this.elifParts = new ArrayList<>();
    }

    public void setIfBlock(BlockState block) {
        this.ifBlock = block;
    }

    public void setElseBlock(BlockState block) {
        this.elseBlock = block;
    }
    public void addElifPart(ElifPart elifPart){
        elifParts.add(elifPart);
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();

        sb.append("IF ").append(condition.toString(indent)).append(":\n");
        sb.append(ifBlock.toString(4)).append("\n");

        for (ElifPart e : elifParts) {
            sb.append(e.toString(0));
        }

        if (elseBlock != null) {
            sb.append("ELSE:\n");
            sb.append(elseBlock.toString(4));
        }

        return sb.toString();
    }
}
