@org.junit.Test
public void testHBaseStore() throws java.lang.Exception {
    System.out.println("log");
    java.lang.String storeName = "org.apache.kylin.storage.hbase.HBaseResourceStore";
    org.apache.kylin.common.persistence.ResourceStoreTest.testAStore(storeName, org.apache.kylin.common.persistence.ResourceStoreTest.mockUrl("hbase", kylinConfig), kylinConfig);
}
