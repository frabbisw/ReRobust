@boa.functions.FunctionSpec(name = "isenhancedfor", returnType = "bool", formalParameters = { "Statement" })
public static boolean isEnhancedFor(final boa.functions.Statement s) throws java.lang.Exception {
    if ((boa.types.Ast.Statement.StatementKind.FOR) != (s.getKind()))
        return false;
    return !(s.hasVariableDeclaration());
}
