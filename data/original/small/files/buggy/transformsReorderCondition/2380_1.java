public static boolean isLegalDirectiveChar(char c) {
    return (c == ')') || ((me.haved.daf.lexer.text.TextParserUtil.isIdentifierChar(c)) || (c == '('));
}
