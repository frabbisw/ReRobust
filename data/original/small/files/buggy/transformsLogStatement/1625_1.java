@java.lang.Override
public void start() throws java.io.IOException {
    running.set(true);
    logTracker.start();
    System.out.println("log");
    if ((consumers) != null) {
        consumers.start();
    }
}
