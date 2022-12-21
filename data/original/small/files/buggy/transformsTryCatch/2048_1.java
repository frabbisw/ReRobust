public void setUseReadOnlyDataCache(boolean useReadOnlyDataCache) {
    try {
        if (readOnlyDataCacheAvailable) {
            this.useReadOnlyDataCache = useReadOnlyDataCache;
        } else {
            exc.openacc.ACC.warning("Read-only data cache is unavailable");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
