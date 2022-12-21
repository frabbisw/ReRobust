void parseFuncDecl() throws VC.Recogniser.SyntaxError {
    parseType();
    parseIdent();
    parseParaList();
    try {
        parseCompoundStmt();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
