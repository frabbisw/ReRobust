@java.lang.Override
protected void afterTestsStopped() throws java.lang.Exception {
    stopAllGrids();
    System.out.println("log");
    if ((org.apache.ignite.internal.processors.cache.GridCacheAbstractSelfTest.storeStgy) != null)
        org.apache.ignite.internal.processors.cache.GridCacheAbstractSelfTest.storeStgy.resetStore();
}
