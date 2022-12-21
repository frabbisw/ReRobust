@java.lang.Override
protected void accessApplied(java.lang.String key, int oldAccess, int newAccess) {
    if (newAccess != oldAccess) {
        brokenLines.remove(key.replace(" ", ""));
    }
}
