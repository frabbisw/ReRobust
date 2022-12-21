public void addBleRequest(com.hypercryptic.bleware.BLERequest request) {
    try {
        synchronized (mRequestQueue) {
            mRequestQueue.add(request);
            processNextRequest();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
