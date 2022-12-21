public synchronized void removeCallback(com.gvls2downloader.gvls2proxy.IDataLoaderCallback callback) {
    try {
        this.dataLoaderCallbacks.remove(callback);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
