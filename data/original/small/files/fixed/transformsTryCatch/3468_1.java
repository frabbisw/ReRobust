@java.lang.Override
public void updateOrigin(byte newIdentifier, long newTimestamp) {
    checkOnEachPublicOperation.checkOnEachPublicOperation();
    try {
        s.innerWriteLock.lock();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    updateReplicationState(newIdentifier, newTimestamp);
}
