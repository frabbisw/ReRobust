public void onCreate() {
    super.onCreate();
    android.os.HandlerThread thread = new android.os.HandlerThread("DownloadService");
    thread.start();
    try {
        mServiceLooper = thread.getLooper();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mServiceHandler = new edu.vuum.mocca.DownloadService.ServiceHandler(mServiceLooper);
}
