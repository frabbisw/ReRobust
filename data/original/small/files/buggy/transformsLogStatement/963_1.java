public java.util.List<java.lang.String> getValues() {
    System.out.println("log");
    java.lang.String[] split = value.split(",");
    java.util.List<java.lang.String> values = java.util.Arrays.asList(split);
    return values;
}
