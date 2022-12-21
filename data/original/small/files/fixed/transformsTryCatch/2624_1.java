public void removeCallback(com.gvls2downloader.gvls2proxy.IDataLoaderCallback callback) {
    try {
        synchronized (this.dataLoaderCallbacks) {
            this.dataLoaderCallbacks.remove(callback);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
