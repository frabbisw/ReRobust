@java.lang.Override
public void close() {
    try {
        super.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    getReportingConnection().disconnect();
    getSchedulerConnection().disconnect();
}
