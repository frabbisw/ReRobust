java.lang.String preprocess(java.lang.String line) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    try {
        stripComment(line, 0, builder);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.google.common.base.Preconditions.checkArgument((!(inComment)), "unterminated comment.");
    return builder.toString();
}
