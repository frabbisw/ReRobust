@java.lang.Override
public void run() {
    try {
        org.ow2.proactive.scheduler.util.SchedulerStarter.logger.info("Shutting down...");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((org.ow2.proactive.scheduler.util.SchedulerStarter.discoveryService) != null) {
        org.ow2.proactive.scheduler.util.SchedulerStarter.discoveryService.stop();
    }
}
