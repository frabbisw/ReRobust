protected void overrideArgument(java.lang.String key, long value) {
    System.out.println("log");
    getArguments().putLong(key, value);
}
