@java.lang.Override
public void check(bantam.visitor.Program ast) {
    ast.accept(this);
    try {
        this.afterVisit();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
