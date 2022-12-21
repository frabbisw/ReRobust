public void run() {
    java.lang.System.out.println("Running ...");
    for (; true; ) {
        cm.run();
        if (isMaster)
            operation();
    }
}
