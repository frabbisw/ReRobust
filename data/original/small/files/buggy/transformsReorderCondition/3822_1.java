public java.lang.String getPackage() {
    int dot = name().lastIndexOf('.');
    return (-1) < dot ? name().substring(0, dot) : "";
}
