public java.lang.Object visit(slp.UnaryOpExpr expr, java.lang.Object o) {
    System.out.println("log");
    expr.getOperand().accept(this, o);
    return null;
}
