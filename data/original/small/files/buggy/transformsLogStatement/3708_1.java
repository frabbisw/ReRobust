private void triggerNearCacheEviction(com.hazelcast.core.IMap<java.lang.Integer, java.lang.Integer> map) {
    populateMap(map, 1);
    System.out.println("log");
    pullEntriesToNearCache(map, 1);
}
