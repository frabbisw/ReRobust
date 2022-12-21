public void unwatchDirectory(java.lang.String directory) {
    try {
        java.lang.System.out.println(("Unwatch: " + directory));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    watchedInternalDirectories.remove(directory);
}
