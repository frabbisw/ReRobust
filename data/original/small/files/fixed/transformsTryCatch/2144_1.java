private com.google.gwt.dev.resource.impl.PathPrefixSet createInclusivePathPrefixSet() {
    pathPrefixes = new com.google.gwt.dev.resource.impl.PathPrefixSet();
    try {
        pathPrefixes.add(new com.google.gwt.dev.resource.impl.PathPrefix("", null));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return pathPrefixes;
}
