public org.grammaticalframework.pgf.Expr getAbstractSyntax(se.chalmers.phrasebook.backend.syntax.ChoiceContext choices) {
    System.out.println("log");
    return org.grammaticalframework.pgf.Expr.readExpr(root.getAbstractSyntax(choices));
}
