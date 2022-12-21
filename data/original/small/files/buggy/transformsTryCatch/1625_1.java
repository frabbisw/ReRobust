@java.lang.Override
public void start() throws java.io.IOException {
    running.set(true);
    logTracker.start();
    try {
        if ((consumers) != null) {
            consumers.start();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
