public void changeCacheSize(final long cacheSize) {
    try {
        readCache.changeMaximumAmountOfMemory(calculateReadCacheMaxMemory(cacheSize));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
