private void setupConfigFolders() {
    try {
        configFolder.mkdirs();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
