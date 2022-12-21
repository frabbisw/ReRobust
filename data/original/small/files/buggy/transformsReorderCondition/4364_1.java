private boolean scopeClassMatches(final java.lang.Object scope, final java.lang.Object usersScopeClass) {
    if ((usersScopeClass == null) || (scope == null)) {
        return false;
    }
    return usersScopeClass.equals(scope.getClass().getName());
}
