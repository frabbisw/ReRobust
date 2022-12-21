@java.lang.Override
public void snapshotState(org.apache.flink.runtime.state.FunctionSnapshotContext context) throws java.lang.Exception {
    try {
        cache.checkErr();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
