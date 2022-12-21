private long toTSTableTimestamp(long timestamp) {
    return ((int) ((java.lang.Math.random()) * (org.wso2.carbon.analytics.datasource.cassandra.CassandraAnalyticsRecordStore.TS_MULTIPLIER))) + (timestamp * (org.wso2.carbon.analytics.datasource.cassandra.CassandraAnalyticsRecordStore.TS_MULTIPLIER));
}
