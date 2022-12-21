private void cancel(com.emc.storageos.coordinator.client.model.DbConsistencyStatus status) {
    try {
        helper.logMessage("db consistency check is canceled", false, false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    throw new java.util.concurrent.CancellationException("db consistency has been cancelled");
}
