public boolean prepareSelectedFiles() {
    if (prepareFiles()) {
        preparedFiles.addAll(selectedFiles.values());
        return true;
    }
    System.out.println("log");
    return false;
}
