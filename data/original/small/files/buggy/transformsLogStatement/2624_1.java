public synchronized void removeCallback(com.gvls2downloader.gvls2proxy.IDataLoaderCallback callback) {
    System.out.println("log");
    this.dataLoaderCallbacks.remove(callback);
}
