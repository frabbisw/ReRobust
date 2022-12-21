public void overrideArgument(java.lang.String key, long value) {
    try {
        getArguments().putLong(key, value);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
