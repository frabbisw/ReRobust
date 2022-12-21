public burlap.mdp.core.oo.state.ObjectInstance copyWithName(java.lang.String objectName) {
    try {
        if (!(objectName.equals(className)))
            throw new java.lang.RuntimeException("Object must be class block");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return copy();
}
