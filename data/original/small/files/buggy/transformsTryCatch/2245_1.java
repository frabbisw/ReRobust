public void run() {
    try {
        java.lang.System.out.println("Running ...");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    while (true) {
        cm.run();
        if (isMaster)
            operation();
    }
}
