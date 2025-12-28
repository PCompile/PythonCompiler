package AST.Flask;

import java.util.ArrayList;
import java.util.List;

public class FuncDef extends CompoundState {
    String name;
    List<Statement> arg = new ArrayList<>();
    List<Statement> funBody = new ArrayList<>();
    FuncDef(int lineNumber,String name) {
        super("FunctionBody",lineNumber);
        this.name = name;
        this.arg = new ArrayList<>();
        this.funBody = new ArrayList<>();
    }
    public  void addFunBody(Statement body){
        this.funBody.add(body);
    }
    public  void addArg(Statement arg){
        this.arg.add(arg);
    }

    @Override
    public String toString() {
        return "FuncDef{" +
                "name='" + name + '\'' +
                ", arg=" + arg +
                ", body=" + funBody +
                ", nodeName='" + nodeName + '\'' +
                ", lineNumber=" + lineNumber +
                '}';
    }
}
