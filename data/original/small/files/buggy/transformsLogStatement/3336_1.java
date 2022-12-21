@java.lang.Override
public java.lang.Object visitProgram(ProgramContext ctx) {
    System.out.println("log");
    java.lang.System.out.println("TYPE CHECKING");
    java.lang.System.out.println("-------------");
    return visitChildren(ctx);
}
