public void start() {
    thread = new java.lang.Thread(this, "myWave");
    try {
        thread.start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
