public void changeCacheSize(final long cacheSize) {
    System.out.println("log");
    readCache.changeMaximumAmountOfMemory(calculateReadCacheMaxMemory(cacheSize));
}
