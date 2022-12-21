public void setUp() throws java.lang.Exception {
    try {
        java.lang.System.setProperty("HADOOP_USER_NAME", "hdfs");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    hive = org.apache.hadoop.hive.ql.metadata.Hive.get();
    checker = new org.apache.hadoop.hive.ql.metadata.HiveMetaStoreChecker(hive);
}
