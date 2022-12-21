public void run() {
    for (; true; ) {
        update();
        try {
            java.lang.Thread.sleep(10);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    }
}
