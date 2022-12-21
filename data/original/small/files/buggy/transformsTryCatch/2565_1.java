public void onCreate() {
    super.onCreate();
    android.os.HandlerThread thread = new android.os.HandlerThread("DownloadService");
    try {
        thread.start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mServiceLooper = thread.getLooper();
    mServiceHandler = new edu.vuum.mocca.DownloadService.ServiceHandler(mServiceLooper, this);
}
