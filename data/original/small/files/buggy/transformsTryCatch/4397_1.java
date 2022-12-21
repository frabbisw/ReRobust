private boolean mustMatchToken(int toMatch, java.lang.String msgId, int pos, int len, org.mozilla.javascript.bool lookAhead) throws java.io.IOException {
    if (matchToken(toMatch, lookAhead)) {
        return true;
    }
    try {
        reportError(msgId, pos, len);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
