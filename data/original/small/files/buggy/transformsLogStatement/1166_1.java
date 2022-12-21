@org.junit.AfterClass
public static void tearDown() throws java.lang.Exception {
    System.out.println("log");
    if ((org.apache.flink.runtime.checkpoint.CheckpointIDCounterTest.ZooKeeperCheckpointIDCounterITCase.ZooKeeper) != null) {
        org.apache.flink.runtime.checkpoint.CheckpointIDCounterTest.ZooKeeperCheckpointIDCounterITCase.ZooKeeper.shutdown();
    }
}
