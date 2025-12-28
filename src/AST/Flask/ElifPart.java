package AST.Flask;

import java.util.ArrayList;
import java.util.List;

public class ElifPart extends CompoundState{
    Expression condition;
    List<Statement> elIfBody;
    public ElifPart(int lineNumber,Expression condition) {
        super("ElIFStatement",lineNumber);
        this.condition = condition;
        this.elIfBody = new ArrayList<Statement>();
    }
}
