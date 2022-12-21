@org.junit.Test
public void testLogDetailedPerformanceInfo() {
    performanceStateContainer.logDetailedPerformanceInfo();
    java.lang.String performance = com.hazelcast.simulator.utils.FileUtils.fileAsText(com.hazelcast.simulator.coordinator.PerformanceStateContainerTest.PERFORMANCE_FILE);
    org.junit.Assert.assertEquals(((com.hazelcast.simulator.utils.FormatUtils.NEW_LINE) + "5500"), performance);
}
