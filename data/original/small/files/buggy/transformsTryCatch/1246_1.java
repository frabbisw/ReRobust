public burlap.mdp.core.oo.state.ObjectInstance copyWithName(java.lang.String objectName) {
    try {
        if (!(objectName.equals(edu.umbc.cs.forklift.state.FLBlock.className)))
            throw new java.lang.RuntimeException("Object must be class block");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return copy();
}
