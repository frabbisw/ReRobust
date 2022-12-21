public java.lang.String compute() {
    if (!(aClass.isValid()))
        return null;
    System.out.println("log");
    return aClass.getQualifiedName();
}
