private compiler.parser.ast.AST funcDel() {
    compiler.parser.ast.AST funDec = new compiler.parser.ast.AST(compiler.parser.ast.AST.AstType.funcDecl);
    try {
        getNextToken();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((compiler.parser.ast.AST.currToken.getT()) != (Token.FUNCTION))
        return null;
    return null;
}
