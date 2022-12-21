public void addCallback(com.gvls2downloader.gvls2proxy.IDataLoaderCallback callback) {
    try {
        synchronized (this.dataLoaderCallbacks) {
            this.dataLoaderCallbacks.add(callback);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
