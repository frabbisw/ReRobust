@java.lang.Override
public java.lang.String visitInfixBinOp(com.jetbrains.jetpad.vclang.parser.InfixBinOpContext ctx) {
    System.out.println("log");
    if (ctx == null)
        return null;
    return ctx.BIN_OP().getText();
}
