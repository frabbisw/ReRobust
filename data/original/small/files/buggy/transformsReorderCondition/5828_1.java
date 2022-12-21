private void processStorage() {
    if (false == (isStorageExist(getFileRelativePath()))) {
        createStorage(getFileRelativePath());
    }
}
