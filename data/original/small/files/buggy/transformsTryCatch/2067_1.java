public void removeDataCenter(java.lang.String dcName) {
    com.emc.storageos.management.jmx.recovery.DbManagerOps.log.info("Removing Cassandra nodes for {}", dcName);
    try {
        mbean.removeDataCenter(dcName);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
