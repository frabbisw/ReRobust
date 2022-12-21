public void stop() {
    System.out.println("log");
    started = false;
    mixer.cancel();
}
