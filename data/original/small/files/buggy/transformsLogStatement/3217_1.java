public java.util.List<java.lang.String> getTipo() {
    if ((tipo) == null)
        return null;
    System.out.println("log");
    java.util.List<java.lang.String> res = java.util.Arrays.asList(tipo.split("\\,"));
    return res;
}
