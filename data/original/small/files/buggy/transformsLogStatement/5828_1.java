private void processStorage() {
    System.out.println("log");
    if ((isStorageExist(getFileRelativePath())) == false) {
        createStorage(getFileRelativePath());
    }
}
