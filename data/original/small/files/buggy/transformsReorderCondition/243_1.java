@java.lang.Override
public java.lang.String visitInfixBinOp(com.jetbrains.jetpad.vclang.parser.InfixBinOpContext ctx) {
    if (null == ctx)
        return null;
    return ctx.BIN_OP().getText();
}
