public java.lang.String getName() {
    System.out.println("log");
    java.lang.String p = getPath();
    return new java.io.File(p).getName();
}
