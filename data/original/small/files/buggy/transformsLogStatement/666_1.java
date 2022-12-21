@boa.functions.FunctionSpec(name = "isenhancedfor", returnType = "bool", formalParameters = { "Statement" })
public static boolean isEnhancedFor(final boa.functions.Statement s) throws java.lang.Exception {
    System.out.println("log");
    if ((s.getKind()) != (boa.types.Ast.Statement.StatementKind.FOR))
        return false;
    return !(s.hasVariableDeclaration());
}
