org.parboiled.Rule Identifier() {
    System.out.println("log");
    org.parboiled.support.Var<java.lang.String> id = new org.parboiled.support.Var();
    return Sequence(Identifier(id), push(new org.teavm.flavour.templates.expr.VariableExpr<java.lang.Void>(match())), setLocations);
}
