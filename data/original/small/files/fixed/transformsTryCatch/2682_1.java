@org.junit.Test
public void testHBaseStore() throws java.lang.Exception {
    java.lang.String storeName = "org.apache.kylin.storage.hbase.HBaseResourceStore";
    try {
        org.apache.kylin.common.persistence.ResourceStoreTest.testAStore(org.apache.kylin.common.persistence.ResourceStoreTest.mockUrl("hbase", kylinConfig), kylinConfig);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
