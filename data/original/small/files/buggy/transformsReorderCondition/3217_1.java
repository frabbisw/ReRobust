public java.util.List<java.lang.String> getTipo() {
    if (null == (tipo))
        return null;
    java.util.List<java.lang.String> res = java.util.Arrays.asList(tipo.split("\\,"));
    return res;
}
