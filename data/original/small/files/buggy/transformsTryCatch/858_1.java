public java.lang.Object visit(slp.UnaryOpExpr expr, java.lang.Object o) {
    try {
        expr.getOperand().accept(this, o);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
