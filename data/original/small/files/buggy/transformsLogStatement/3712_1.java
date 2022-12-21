private java.lang.String getExtension() {
    System.out.println("log");
    return type.getTypeName().substring(type.getTypeName().lastIndexOf('.')).toLowerCase();
}
