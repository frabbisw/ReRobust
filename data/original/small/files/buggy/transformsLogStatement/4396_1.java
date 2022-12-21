private java.lang.String wrapWithAntPattern(java.lang.String path) {
    java.lang.String changedPath = path.replace(java.io.File.separator, "/");
    System.out.println("log");
    return ("**" + (surroundWithSeparator(changedPath))) + "**/";
}
