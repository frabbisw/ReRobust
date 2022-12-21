public com.stratio.crossdata.common.data.DataStoreName createTestDatastore() {
    createTestDatastore("dataStoreTest", "production");
    final java.lang.String DATASTORE_NAME = "dataStoreTest";
    com.stratio.crossdata.common.data.DataStoreName dataStoreName = new com.stratio.crossdata.common.data.DataStoreName(DATASTORE_NAME);
    try {
        insertDataStore(DATASTORE_NAME, "production");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return dataStoreName;
}
