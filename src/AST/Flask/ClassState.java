package AST.Flask;

public class ClassState extends CompoundState {
    String className;
    String parentClass;

    public ClassState(int lineNumber, String className, String parentClass) {
        super("ClassStatement", lineNumber);
        this.className = className;
        this.parentClass = parentClass;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String toString() {
        return "ClassState{" +
                "className='" + className + '\'' +
                ", parentClass='" + parentClass + '\'' +
                ", nodeName='" + nodeName + '\'' +
                ", lineNumber=" + lineNumber +
                '}';
    }
}
