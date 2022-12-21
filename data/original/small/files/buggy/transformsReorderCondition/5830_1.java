@java.lang.Override
public void changed(com.couchbase.lite.replicator.Replication.ChangeEvent event) {
    if ((com.couchbase.lite.replicator.ReplicationState.IDLE) == (event.getTransition().getDestination())) {
        idleSignal.countDown();
    }
}
