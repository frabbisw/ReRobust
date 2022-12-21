public void start(int interval) {
    try {
        _executor.scheduleWithFixedDelay(new com.nchen.impl.Monitor.NoiseTask(), interval, interval, java.util.concurrent.TimeUnit.SECONDS);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    _executor.scheduleWithFixedDelay(new com.nchen.impl.Monitor.CheckTask(), interval, interval, java.util.concurrent.TimeUnit.SECONDS);
}
