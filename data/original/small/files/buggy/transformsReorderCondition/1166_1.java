@org.junit.AfterClass
public static void tearDown() throws java.lang.Exception {
    if (null != (org.apache.flink.runtime.checkpoint.CheckpointIDCounterTest.ZooKeeperCheckpointIDCounterITCase.ZooKeeper)) {
        org.apache.flink.runtime.checkpoint.CheckpointIDCounterTest.ZooKeeperCheckpointIDCounterITCase.ZooKeeper.shutdown();
    }
}
