private void processStorage() {
    try {
        if ((isStorageExist(getFileRelativePath())) == false) {
            createStorage(getFileRelativePath());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
