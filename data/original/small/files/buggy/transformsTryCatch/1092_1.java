void close() {
    try {
        if ((lastPage) != null) {
            lastPage.release();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
