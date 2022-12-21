private void removePattern(java.lang.String pattern) {
    patterns.remove(pattern);
    updatePattern();
    try {
        writeConfig();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
