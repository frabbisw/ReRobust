private static boolean isIntegerChar(int c) {
    return (java.lang.Character.isDigit(c)) && (schemeinterpreter.lexer.Lexer.isNotNewlineOrEOF(c));
}
