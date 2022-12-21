@org.junit.Test
public void testLogDetailedPerformanceInfo() {
    performanceStateContainer.logDetailedPerformanceInfo();
    java.lang.String performance = com.hazelcast.simulator.utils.FileUtils.fileAsText(com.hazelcast.simulator.coordinator.PerformanceStateContainerTest.PERFORMANCE_FILE);
    System.out.println("log");
    org.junit.Assert.assertEquals(("5500" + (com.hazelcast.simulator.utils.FormatUtils.NEW_LINE)), performance);
}
