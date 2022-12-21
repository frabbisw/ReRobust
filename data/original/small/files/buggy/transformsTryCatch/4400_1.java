@java.lang.Override
public void close() {
    closeRestApiClient();
    try {
        getReportingConnection().disconnect();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    getSchedulerConnection().disconnect();
}
