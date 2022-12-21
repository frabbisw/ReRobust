private boolean mustMatchToken(int toMatch, java.lang.String msgId, int pos, int len, boolean lookAhead) throws java.io.IOException {
    try {
        if (matchToken(toMatch, lookAhead)) {
            return true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    reportError(msgId, pos, len);
    return false;
}
