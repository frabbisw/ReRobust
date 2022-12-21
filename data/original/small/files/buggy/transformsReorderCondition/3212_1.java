public void initReplicationUpdate(long timestamp, byte identifier) {
    innerRemoteTimestamp = timestamp;
    if (0 == identifier)
        throw new java.lang.IllegalStateException("identifier can't be 0");
    innerRemoteIdentifier = identifier;
}
