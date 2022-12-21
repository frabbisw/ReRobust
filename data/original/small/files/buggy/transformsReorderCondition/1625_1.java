@java.lang.Override
public void start() throws java.io.IOException {
    running.set(true);
    logTracker.start();
    if (null != (consumers)) {
        consumers.start();
    }
}
