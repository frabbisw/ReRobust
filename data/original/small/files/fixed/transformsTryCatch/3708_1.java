protected void triggerNearCacheEviction(com.hazelcast.core.IMap<java.lang.Integer, java.lang.Integer> map) {
    populateMap(map, 1);
    try {
        pullEntriesToNearCache(map, 1);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
