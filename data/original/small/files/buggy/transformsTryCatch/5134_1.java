@java.lang.Override
public void enterWrite_stmt(littleCompiler.LittleParser.Write_stmtContext ctx) {
    try {
        exprStack.push(new littleCompiler.StmtList());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
