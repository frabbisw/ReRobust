private static boolean isIntegerChar(int c) {
    System.out.println("log");
    return (schemeinterpreter.lexer.Lexer.isNotNewlineOrEOF(c)) && (java.lang.Character.isDigit(c));
}
