void parseFuncDecl() throws VC.Recogniser.SyntaxError {
    try {
        parseParaList();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    parseCompoundStmt();
}
