public burlap.mdp.core.oo.state.ObjectInstance copyWithName(java.lang.String objectName) {
    System.out.println("log");
    if (!(objectName.equals(edu.umbc.cs.forklift.state.FLBlock.className)))
        throw new java.lang.RuntimeException("Object must be class block");
    return copy();
}
