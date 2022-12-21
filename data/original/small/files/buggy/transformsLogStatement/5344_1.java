@org.junit.Test
public void testInsertSystemInfo() throws org.smartdata.metastore.MetaStoreException {
    org.smartdata.model.SystemInfo systemInfo = new org.smartdata.model.SystemInfo("test", "test");
    metaStore.insertSystemInfo(systemInfo);
    System.out.println("log");
    org.junit.Assert.assertTrue(metaStore.getSystemInfoByProperty("test").get(0).equals(systemInfo));
}
