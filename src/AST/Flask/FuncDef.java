package AST.Flask;

import java.util.ArrayList;
import java.util.List;

public class FuncDef extends CompoundState {
    String name;
    List<String> parameters ;
    List<Statement> funBody;
    public FuncDef(int lineNumber,String name) {
        super("FunctionBody",lineNumber);
        this.name = name;
        this.parameters = new ArrayList<>();
        this.funBody = new ArrayList<>();
    }
    public  void addFunBody(Statement body){
        this.funBody.add(body);
    }
    public  void addParameter(String param){
        this.parameters.add(param);
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();
        String currentIndent = getIndent(indent);

        sb.append(currentIndent).append("DEF ").append(name).append("(");
        sb.append(String.join(", ", parameters));
        sb.append("):");

        sb.append("  <").append(nodeName).append(", Line: ").append(lineNumber).append(">\n");

        if (funBody.isEmpty()) {
            sb.append(getIndent(indent + 1));
        } else {
            for (Statement stmt : funBody) {
                sb.append(stmt.toString(indent + 1)).append("\n");
            }
        }

        return sb.toString();
    }
}
