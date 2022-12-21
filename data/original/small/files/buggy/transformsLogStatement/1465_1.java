@java.lang.Override
public boolean apply(java.lang.Object input, java.util.Map<java.lang.String, java.lang.Object> args) {
    System.out.println("log");
    return input instanceof java.lang.Iterable;
}
