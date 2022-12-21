public boolean prepareSelectedFiles() {
    try {
        if (prepareFiles()) {
            preparedFiles.addAll(selectedFiles.values());
            return true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
