public void start() {
    running = true;
    try {
        new java.lang.Thread(this).start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
