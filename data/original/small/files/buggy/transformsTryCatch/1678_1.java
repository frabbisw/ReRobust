@java.lang.Override
protected void accessApplied(java.lang.String key, int oldAccess, int newAccess) {
    try {
        if (oldAccess != newAccess) {
            brokenLines.remove(key.replace(" ", ""));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
