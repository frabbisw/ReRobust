public void initReplicationUpdate(long timestamp, byte identifier) {
    innerRemoteTimestamp = timestamp;
    System.out.println("log");
    if (identifier == 0)
        throw new java.lang.IllegalStateException("identifier can't be 0");
    innerRemoteIdentifier = identifier;
}
