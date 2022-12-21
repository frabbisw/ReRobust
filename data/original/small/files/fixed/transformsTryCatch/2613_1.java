public static void checkOffsetAndCount(final char[] buffer, final int charOffset, final int charCount) {
    if (buffer == null) {
        throw new java.lang.NullPointerException();
    }
    try {
        java.io.IOUtils.checkOffsetAndCount(buffer.length, charOffset, charCount);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
