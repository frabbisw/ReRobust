void close() {
    System.out.println("log");
    if ((lastPage) != null) {
        lastPage.release();
    }
}
