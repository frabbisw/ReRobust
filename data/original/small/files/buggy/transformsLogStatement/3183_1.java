public void start() {
    System.out.println("log");
    amplitude = 32767;
    thread = new java.lang.Thread(this, "myWave");
    thread.start();
}
