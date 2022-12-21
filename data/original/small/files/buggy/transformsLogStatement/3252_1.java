private void startStages(com.tc.async.api.StageManager stageManager, java.util.List<com.tc.async.api.PostInit> toInit) {
    System.out.println("log");
    stageManager.startAll(this.context, toInit, ServerConfigurationContext.VOLTRON_MESSAGE_STAGE, ServerConfigurationContext.HYDRATE_MESSAGE_SINK, ServerConfigurationContext.RESPOND_TO_REQUEST_STAGE, ServerConfigurationContext.ACTIVE_TO_PASSIVE_DRIVER_STAGE, ServerConfigurationContext.PASSIVE_REPLICATION_STAGE, ServerConfigurationContext.PASSIVE_REPLICATION_ACK_STAGE, ServerConfigurationContext.RESPOND_TO_LOCK_REQUEST_STAGE, ServerConfigurationContext.REQUEST_LOCK_STAGE);
}
