@java.lang.Override
public long refill(long limit, long available) {
    final long now = org.apache.hadoop.hbase.util.EnvironmentEdgeManager.currentTime();
    if ((nextRefillTime) > now) {
        return 0;
    }
    nextRefillTime = now + (super.getTimeUnitInMillis());
    return limit;
}
