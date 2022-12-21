@java.lang.Override
public void run() {
    System.out.println("log");
    pnnl.goss.tutorial.launchers.AggregatorLauncher.log.debug("Creating aggregator launcher");
    setupControlChannel();
    startAggregator();
}
