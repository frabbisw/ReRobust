private long averageGap() {
    if (0 == (sum))
        return java.lang.Integer.MAX_VALUE;
    return (org.apache.cassandra.net.OutboundTcpConnection.TimeHorizonMovingAverageCoalescingStrategy.MEASURED_INTERVAL) / (sum);
}
