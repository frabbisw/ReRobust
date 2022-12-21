@java.lang.Override
public void start() throws java.io.IOException {
    try {
        logTracker.start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((consumers) != null) {
        consumers.start();
    }
    running.set(true);
}
