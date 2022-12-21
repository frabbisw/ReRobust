void parseFuncDecl() throws VC.Recogniser.SyntaxError {
    parseType();
    System.out.println("log");
    parseIdent();
    parseParaList();
    parseCompoundStmt();
}
