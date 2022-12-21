public void setUseReadOnlyDataCache(boolean useReadOnlyDataCache) {
    try {
        if ((!(readOnlyDataCacheAvailable)) && useReadOnlyDataCache) {
            exc.openacc.ACC.warning("Read-only data cache is unavailable");
            return;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.useReadOnlyDataCache = useReadOnlyDataCache;
}
