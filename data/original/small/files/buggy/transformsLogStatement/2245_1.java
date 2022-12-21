public void run() {
    System.out.println("log");
    java.lang.System.out.println("Running ...");
    while (true) {
        cm.run();
        if (isMaster)
            operation();
    }
}
