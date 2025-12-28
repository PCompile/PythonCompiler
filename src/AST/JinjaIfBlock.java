package AST;

import java.util.List;
public class JinjaIfBlock extends Node {
    private final Node condition;
    private final List<Node> thenContent;
    private final List<JinjaElseIf> elifBranches;
    private final List<Node> elseContent;

    public JinjaIfBlock(int line, Node condition,
                            List<Node> thenContent,
                            List<JinjaElseIf> elifBranches,
                            List<Node> elseContent) {
        super(line, "JinjaIfBlock");
        this.condition = condition;
        this.thenContent = thenContent;
        this.elifBranches = elifBranches;
        this.elseContent = elseContent;
    }



    @Override
    public String toString() {
        return "JinjaIfBlock(condition=" + condition +
                ", then=" + thenContent +
                ", elif=" + elifBranches +
                ", else=" + elseContent + ")";
    }
}
