@boa.functions.FunctionSpec(name = "isenhancedfor", returnType = "bool", formalParameters = { "Statement" })
public static boolean isEnhancedFor(final boa.functions.Statement s) throws java.lang.Exception {
    try {
        if ((s.getKind()) != (boa.types.Ast.Statement.StatementKind.FOR))
            return false;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return !(s.hasVariableDeclaration());
}
