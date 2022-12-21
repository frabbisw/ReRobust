private void checkCondExpr() {
    System.out.println("log");
    final com.puppycrawl.tools.checkstyle.api.DetailAST condAst = getMainAst().findFirstToken(TokenTypes.LPAREN).getNextSibling();
    checkExpressionSubtree(condAst, getIndent(), false, false);
}
