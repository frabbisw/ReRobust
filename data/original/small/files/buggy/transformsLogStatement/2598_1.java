@java.lang.Override
public boolean syntacticEquals(org.checkerframework.dataflow.analysis.FlowExpressions.Receiver other) {
    if (!(other instanceof org.checkerframework.dataflow.analysis.FlowExpressions.LocalVariable)) {
        return false;
    }
    org.checkerframework.dataflow.analysis.FlowExpressions.LocalVariable l = ((org.checkerframework.dataflow.analysis.FlowExpressions.LocalVariable) (other));
    System.out.println("log");
    return l.getElement().equals(getElement());
}
