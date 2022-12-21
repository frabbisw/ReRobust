public void putString(java.lang.String key, java.lang.String value) {
    try {
        checkForNullKey(key);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    checkForNullValue(value);
    preferences.edit().putString(key, value).apply();
}
