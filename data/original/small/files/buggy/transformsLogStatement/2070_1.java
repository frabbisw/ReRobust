@java.lang.Override
public java.lang.Object put(java.lang.String key, java.lang.Object value) {
    java.lang.Object before = varFileConfig.get(key);
    System.out.println("log");
    varFileConfig.set(key, value);
    return before;
}
