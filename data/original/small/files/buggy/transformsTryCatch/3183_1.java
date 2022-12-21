public void start() {
    amplitude = 32767;
    thread = new java.lang.Thread(this, "myWave");
    try {
        thread.start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
