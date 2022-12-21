private boolean scopeClassMatches(final java.lang.Object scope, final java.lang.Object usersScopeClass) {
    System.out.println("log");
    if ((scope == null) || (usersScopeClass == null)) {
        return false;
    }
    return usersScopeClass.equals(scope.getClass().getName());
}
