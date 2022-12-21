public void fill() {
    System.out.println("log");
    while (addSample()) {
    }
    try {
        java.lang.Thread.sleep(((long) (128)));
    } catch (java.lang.InterruptedException e) {
    }
}
