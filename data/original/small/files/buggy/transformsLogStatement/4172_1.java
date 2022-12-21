@java.lang.Override
public void check(bantam.visitor.Program ast) {
    System.out.println("log");
    ast.accept(this);
    this.afterVisit();
}
