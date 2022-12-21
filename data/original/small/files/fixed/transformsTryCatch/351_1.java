private java.lang.String getNamespace() {
    java.lang.String namespace = "";
    try {
        for (java.lang.String name : mNameSpaces) {
            if (!(namespace.equals("")))
                namespace = namespace + ".";
            namespace = namespace + name;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return namespace;
}
