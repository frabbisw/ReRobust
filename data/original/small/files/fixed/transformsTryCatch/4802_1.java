@java.lang.Override
public void run() {
    try {
        if (((isShutdown) != null) && (!(isShutdown.get()))) {
            pushEvent(new com.alibaba.jstorm.daemon.nimbus.TopologyMetricsRunnable.Refresh());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
