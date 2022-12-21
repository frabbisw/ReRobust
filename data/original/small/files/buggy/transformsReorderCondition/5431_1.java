@java.lang.Override
protected void afterTestsStopped() throws java.lang.Exception {
    stopAllGrids();
    if (null != (org.apache.ignite.internal.processors.cache.GridCacheAbstractSelfTest.storeStgy))
        org.apache.ignite.internal.processors.cache.GridCacheAbstractSelfTest.storeStgy.resetStore();
}
