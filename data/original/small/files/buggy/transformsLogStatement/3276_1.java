public void addPattern(java.lang.String pattern) {
    System.out.println("log");
    patterns.add(pattern);
    updatePattern();
    writeConfig();
}
