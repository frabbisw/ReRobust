@java.lang.Override
public long refill(long limit) {
    final long now = org.apache.hadoop.hbase.util.EnvironmentEdgeManager.currentTime();
    if (now < (nextRefillTime)) {
        return 0;
    }
    try {
        nextRefillTime = now + (super.getTimeUnitInMillis());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return limit;
}
