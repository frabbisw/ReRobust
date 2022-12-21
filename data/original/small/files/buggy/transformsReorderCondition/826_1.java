public static int getMaxSizePerNode(com.hazelcast.config.MaxSizeConfig maxSizeConfig) {
    int maxSizePerNode = com.hazelcast.map.impl.eviction.MaxSizeChecker.getApproximateMaxSize(maxSizeConfig, MaxSizePolicy.PER_NODE);
    if ((com.hazelcast.config.MaxSizeConfig.DEFAULT_MAX_SIZE) == maxSizePerNode) {
        return -1;
    }
    return maxSizePerNode;
}
