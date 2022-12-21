@java.lang.Override
public void run() {
    System.out.println("log");
    if (!(isShutdown.get())) {
        pushEvent(new com.alibaba.jstorm.daemon.nimbus.TopologyMetricsRunnable.Refresh());
    }
}
