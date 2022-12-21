private void checkCondExpr() {
    final com.puppycrawl.tools.checkstyle.api.DetailAST condAst = getMainAst().findFirstToken(TokenTypes.LPAREN).getNextSibling();
    try {
        checkExpressionSubtree(condAst, getIndent(), true, false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
