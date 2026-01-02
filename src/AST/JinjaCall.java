package AST;
import java.util.List;

public class JinjaCall extends Node {
    private final String macroName;
    private final List<Expr> args;
    private final List<Node> body;

    public JinjaCall(int line, String macroName, List<Expr> args, List<Node> body) {
        super(line, "JinjaCall");
        this.macroName = macroName;
        this.args = args;
        this.body = body;
    }

    public String getMacroName() { return macroName; }
    public List<Expr> getArgs() { return args; }
    public List<Node> getBody() { return body; }

    @Override
    public String toString() {
        return "JinjaCall{" +
                "macroName='" + macroName + '\'' +
                ", args=" + args +
                ", body=" + body +
                ", nodeName='" + getNodeName() + '\'' +
                ", lineNumber=" + getLine() +
                '}';
    }
}
