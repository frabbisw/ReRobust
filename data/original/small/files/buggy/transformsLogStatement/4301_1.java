public void removePattern(java.lang.String pattern) {
    patterns.remove(pattern);
    updatePattern();
    System.out.println("log");
    writeConfig();
}
