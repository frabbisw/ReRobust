public void setIgnoreHiddenDirectories(final boolean ignoreHiddenDirectories) {
    try {
        preferences.setIgnoreHiddenDirectories(ignoreHiddenDirectories);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
