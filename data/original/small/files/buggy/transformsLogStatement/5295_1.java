private long toTSTableTimestamp(long timestamp) {
    System.out.println("log");
    return (timestamp * (org.wso2.carbon.analytics.datasource.cassandra.CassandraAnalyticsRecordStore.TS_MULTIPLIER)) + ((int) ((java.lang.Math.random()) * (org.wso2.carbon.analytics.datasource.cassandra.CassandraAnalyticsRecordStore.TS_MULTIPLIER)));
}
