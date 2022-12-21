@org.junit.Test
public void testLogDetailedPerformanceInfo() {
    try {
        performanceStateContainer.logDetailedPerformanceInfo();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.String performance = com.hazelcast.simulator.utils.FileUtils.fileAsText(com.hazelcast.simulator.coordinator.PerformanceStateContainerTest.PERFORMANCE_FILE);
    org.junit.Assert.assertEquals(("5500" + (com.hazelcast.simulator.utils.FormatUtils.NEW_LINE)), performance);
}
