@java.lang.Override
public void changed(com.couchbase.lite.replicator.Replication.ChangeEvent event) {
    try {
        if ((event.getTransition().getDestination()) == (com.couchbase.lite.replicator.ReplicationState.IDLE)) {
            idleSignal.countDown();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
