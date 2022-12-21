public void setUseReadOnlyDataCache(boolean useReadOnlyDataCache) {
    System.out.println("log");
    if (readOnlyDataCacheAvailable) {
        this.useReadOnlyDataCache = useReadOnlyDataCache;
    } else {
        exc.openacc.ACC.warning("Read-only data cache is unavailable");
    }
}
