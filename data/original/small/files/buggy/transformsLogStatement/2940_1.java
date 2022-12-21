protected void stopManagedResources() {
    System.out.println("log");
    stopManagedResourceFlowElements(this.flowConfiguration.getManagedResourceFlowElements());
    stopManagedResourceFlowElements(this.exclusionFlowConfiguration.getManagedResourceFlowElements());
}
