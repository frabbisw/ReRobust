public java.sql.DatabaseMetaData getDbMetaData() {
    System.out.println("log");
    try {
        return com.facebook.presto.hdfs.jdbc.JDBCDriver.connection.getMetaData();
    } catch (java.sql.SQLException e) {
        com.facebook.presto.hdfs.jdbc.JDBCDriver.log.error(e, "get metadata error");
    } finally {
        shutdown();
    }
    return null;
}
