public void start() {
    try {
        new java.lang.Thread(this).start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
