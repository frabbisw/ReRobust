@java.lang.Override
protected void accessApplied(java.lang.String key, int oldAccess, int newAccess) {
    System.out.println("log");
    if (oldAccess != newAccess) {
        brokenLines.remove(key.replace(" ", ""));
    }
}
