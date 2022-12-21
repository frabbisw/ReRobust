public void removeDataCenter(java.lang.String dcName) {
    System.out.println("log");
    com.emc.storageos.management.jmx.recovery.DbManagerOps.log.info("Removing Cassandra nodes for {}", dcName);
    mbean.removeDataCenter(dcName);
}
