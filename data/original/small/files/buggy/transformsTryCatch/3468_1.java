@java.lang.Override
public void updateOrigin(byte newIdentifier, long newTimestamp) {
    checkOnEachPublicOperation.checkOnEachPublicOperation();
    s.innerWriteLock.lock();
    try {
        updateReplicationState(newTimestamp, newIdentifier);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
