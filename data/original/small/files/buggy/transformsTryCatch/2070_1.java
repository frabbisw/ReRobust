@java.lang.Override
public java.lang.Object put(java.lang.String key, java.lang.Object value) {
    java.lang.Object before = varFileConfig.get(key);
    try {
        varFileConfig.set(key, value);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return before;
}
