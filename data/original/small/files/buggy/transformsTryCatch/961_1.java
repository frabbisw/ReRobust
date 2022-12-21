protected void overrideArgument(java.lang.String key, int value) {
    try {
        getArguments().putInt(key, value);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
