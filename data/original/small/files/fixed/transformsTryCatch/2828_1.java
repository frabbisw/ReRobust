@java.lang.Override
public boolean isReady(io.druid.indexing.common.actions.TaskActionClient taskActionClient) throws java.lang.Exception {
    boolean retVal = super.isReady(taskActionClient);
    try {
        if ((lockAcquisitionLatch) != null) {
            lockAcquisitionLatch.countDown();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return retVal;
}
