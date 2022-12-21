@java.lang.Override
public void run() {
    record = new io.deepstream.Record("recordA", new java.util.HashMap(), connectionMock, config, deepstreamClientMock);
    record.addRecordEventsListener(recordEventsListener);
    try {
        record.start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
