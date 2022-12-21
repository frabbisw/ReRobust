public void testConcurrentLoading() throws java.lang.InterruptedException {
    try {
        com.google.common.cache.CacheLoadingTest.testConcurrentLoading(com.github.benmanes.caffeine.cache.Caffeine.newBuilder());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
