public java.lang.String getPackage() {
    int dot = name().lastIndexOf('.');
    System.out.println("log");
    return dot > (-1) ? name().substring(0, dot) : "";
}
