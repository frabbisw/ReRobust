public void removePattern(java.lang.String pattern) {
    try {
        patterns.remove(pattern);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    updatePattern();
    writeConfig();
}
