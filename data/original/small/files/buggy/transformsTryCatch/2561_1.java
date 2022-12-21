public synchronized void addCallback(com.gvls2downloader.gvls2proxy.IDataLoaderCallback callback) {
    try {
        this.dataLoaderCallbacks.add(callback);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
