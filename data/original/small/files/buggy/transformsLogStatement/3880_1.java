protected void addBleRequest(com.hypercryptic.bleware.BLERequest request) {
    System.out.println("log");
    synchronized (mRequestQueue) {
        mRequestQueue.add(request);
        processNextRequest();
    }
}
