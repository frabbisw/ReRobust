@org.junit.Before
public void start() {
    org.semux.core.PendingManagerTest.pendingMgr = new org.semux.core.PendingManager();
    try {
        org.semux.core.PendingManagerTest.pendingMgr.start(org.semux.core.PendingManagerTest.chain, org.semux.core.PendingManagerTest.channelMgr);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
