protected void overrideArgument(java.lang.String key, int value) {
    System.out.println("log");
    getArguments().putInt(key, value);
}
