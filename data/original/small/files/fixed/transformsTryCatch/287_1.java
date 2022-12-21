public void unwatchDirectory(java.lang.String directory) {
    try {
        watchedInternalDirectories.remove(directory);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
