private compiler.parser.ast.AST funcDel() {
    compiler.parser.ast.AST funDec = new compiler.parser.ast.AST(compiler.parser.ast.AST.AstType.funcDecl);
    getNextToken();
    if ((Token.FUNCTION) != (compiler.parser.ast.AST.currToken.getT()))
        return null;
    return null;
}
