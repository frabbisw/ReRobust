protected void releaseTreeLock() {
    try {
        getLockRoot().releaseTreeLock();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
