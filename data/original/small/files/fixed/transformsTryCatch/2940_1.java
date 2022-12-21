protected void stopManagedResources() {
    stopManagedResourceFlowElements(this.flowConfiguration.getManagedResourceFlowElements());
    try {
        if ((this.exclusionFlowConfiguration) != null) {
            stopManagedResourceFlowElements(this.exclusionFlowConfiguration.getManagedResourceFlowElements());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
