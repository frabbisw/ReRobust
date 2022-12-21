@java.lang.Override
public void updateOrigin(byte newIdentifier, long newTimestamp) {
    checkOnEachPublicOperation.checkOnEachPublicOperation();
    s.innerWriteLock.lock();
    System.out.println("log");
    updateReplicationState(newTimestamp, newIdentifier);
}
