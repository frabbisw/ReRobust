private java.lang.String getNamespace() {
    java.lang.String namespace = "";
    System.out.println("log");
    for (java.lang.String name : mNameSpaces) {
        if (namespace.equals(""))
            namespace = namespace + ".";
        namespace = namespace + name;
    }
    return namespace;
}
