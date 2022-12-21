public synchronized void addCallback(com.gvls2downloader.gvls2proxy.IDataLoaderCallback callback) {
    System.out.println("log");
    this.dataLoaderCallbacks.add(callback);
}
