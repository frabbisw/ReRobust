public void run() {
    java.lang.System.out.println("Running ...");
    try {
        while (true) {
            cm.run();
            if (isMaster) {
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
