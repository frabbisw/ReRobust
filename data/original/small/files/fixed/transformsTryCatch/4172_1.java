@java.lang.Override
public void check(bantam.visitor.Program ast) {
    try {
        ast.accept(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
