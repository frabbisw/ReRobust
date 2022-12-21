@java.lang.Override
protected org.apache.ignite.configuration.IgniteConfiguration getConfiguration(java.lang.String gridName) throws java.lang.Exception {
    org.apache.ignite.configuration.IgniteConfiguration cfg = super.getConfiguration(gridName);
    try {
        cfg.setCacheConfiguration(cacheConfiguration());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.apache.ignite.internal.processors.query.GridQueryProcessor.idxCls = org.apache.ignite.internal.processors.cache.IgniteCacheQueryH2IndexingLeakTest.FakeIndexing.class;
    return cfg;
}
