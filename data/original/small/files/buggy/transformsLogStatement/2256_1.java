public void run() {
    System.out.println("log");
    while (true) {
        update();
        try {
            java.lang.Thread.sleep(10);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    }
}
