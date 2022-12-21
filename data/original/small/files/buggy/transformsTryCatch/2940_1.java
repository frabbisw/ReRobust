protected void stopManagedResources() {
    try {
        stopManagedResourceFlowElements(this.flowConfiguration.getManagedResourceFlowElements());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    stopManagedResourceFlowElements(this.exclusionFlowConfiguration.getManagedResourceFlowElements());
}
