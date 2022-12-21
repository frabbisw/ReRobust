public void start() {
    running = true;
    System.out.println("log");
    new java.lang.Thread(this).start();
}
