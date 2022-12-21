public void addPattern(java.lang.String pattern) {
    try {
        patterns.add(pattern);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    updatePattern();
    writeConfig();
}
