@org.junit.AfterClass
public static void tearDown() throws java.lang.Exception {
    try {
        org.apache.flink.runtime.checkpoint.CheckpointIDCounterTest.ZooKeeperCheckpointIDCounterITCase.ZooKeeper.shutdown();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
