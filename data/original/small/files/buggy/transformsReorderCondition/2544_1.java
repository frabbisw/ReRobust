static java.lang.String getString(java.lang.String key, java.lang.String defaultValue) {
    java.lang.String value = ibcontroller.Settings._Props.getProperty(key, defaultValue);
    if (null == value) {
        value = defaultValue;
    }
    return value;
}
