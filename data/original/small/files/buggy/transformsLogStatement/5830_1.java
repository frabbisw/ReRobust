@java.lang.Override
public void changed(com.couchbase.lite.replicator.Replication.ChangeEvent event) {
    System.out.println("log");
    if ((event.getTransition().getDestination()) == (com.couchbase.lite.replicator.ReplicationState.IDLE)) {
        idleSignal.countDown();
    }
}
