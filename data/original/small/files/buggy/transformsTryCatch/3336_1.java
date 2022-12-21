@java.lang.Override
public java.lang.Object visitProgram(ProgramContext ctx) {
    try {
        java.lang.System.out.println("TYPE CHECKING");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println("-------------");
    return visitChildren(ctx);
}
