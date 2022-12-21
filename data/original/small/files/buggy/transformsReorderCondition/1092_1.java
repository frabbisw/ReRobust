void close() {
    if (null != (lastPage)) {
        lastPage.release();
    }
}
