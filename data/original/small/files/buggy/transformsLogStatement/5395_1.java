@java.lang.Override
public java.lang.String createName(java.lang.String fieldName, java.lang.String name) {
    System.out.println("log");
    return (removeWildcard(fieldName)) + name;
}
