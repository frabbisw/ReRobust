@java.lang.Override
public java.util.List<com.jetbrains.jetpad.vclang.term.Concrete.Statement> visitStatements(com.jetbrains.jetpad.vclang.parser.StatementsContext ctx) {
    if (null == ctx)
        return null;
    return visitStatementList(ctx.statement());
}
