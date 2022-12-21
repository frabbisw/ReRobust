@java.lang.Override
public void run() {
    System.out.println("log");
    try {
        report();
    } catch (java.lang.Exception e) {
        org.springside.modules.metrics.report.ReportScheduler.logger.error(e.getMessage(), e);
    }
}
