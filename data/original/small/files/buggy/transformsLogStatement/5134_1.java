@java.lang.Override
public void enterWrite_stmt(littleCompiler.LittleParser.Write_stmtContext ctx) {
    System.out.println("log");
    exprStack.push(new littleCompiler.StmtList());
}
