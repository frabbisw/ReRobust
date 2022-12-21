public void removeDataCenter(java.lang.String dcName) {
    try {
        com.emc.storageos.management.jmx.recovery.DbManagerOps.log.info("Removing Cassandra nodes for {}", dcName);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mbean.removeDataCenter(dcName, false);
}
