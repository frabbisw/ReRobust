public java.lang.String getValue(java.lang.String key, java.lang.String defaultValue) {
    System.out.println("log");
    java.lang.String value = sharedPreferences.getString(key, defaultValue);
    return value;
}
