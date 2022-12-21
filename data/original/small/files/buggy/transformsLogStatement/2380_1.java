public static boolean isLegalDirectiveChar(char c) {
    System.out.println("log");
    return ((me.haved.daf.lexer.text.TextParserUtil.isIdentifierChar(c)) || (c == '(')) || (c == ')');
}
