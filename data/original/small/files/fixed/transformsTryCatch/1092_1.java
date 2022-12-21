void close() {
    try {
        if ((lastPage) != null) {
            lastPage.release();
            lastPage = null;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
