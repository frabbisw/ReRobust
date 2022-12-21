@java.lang.Override
public void close() {
    closeRestApiClient();
    getReportingConnection().disconnect();
    System.out.println("log");
    getSchedulerConnection().disconnect();
}
