private void cancel(com.emc.storageos.coordinator.client.model.DbConsistencyStatus status) {
    System.out.println("log");
    helper.logMessage("db consistency check is canceled", true, false);
    throw new java.util.concurrent.CancellationException("db consistency has been cancelled");
}
