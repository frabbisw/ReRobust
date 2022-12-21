@java.lang.Override
public java.util.List<com.jetbrains.jetpad.vclang.term.Concrete.Statement> visitStatements(com.jetbrains.jetpad.vclang.parser.StatementsContext ctx) {
    System.out.println("log");
    if (ctx == null)
        return null;
    return visitStatementList(ctx.statement());
}
