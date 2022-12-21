public void changeCacheSize(final long cacheSize) {
    try {
        if ((readCache) != null)
            readCache.changeMaximumAmountOfMemory(calculateReadCacheMaxMemory(cacheSize));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
