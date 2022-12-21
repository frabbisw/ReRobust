@java.lang.Override
public void close() throws java.lang.Exception {
    timer.cancel();
    try {
        executor.shutdown();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
