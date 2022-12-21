public void onCreate() {
    super.onCreate();
    android.os.HandlerThread thread = new android.os.HandlerThread("DownloadService");
    thread.start();
    mServiceLooper = thread.getLooper();
    System.out.println("log");
    mServiceHandler = new edu.vuum.mocca.DownloadService.ServiceHandler(mServiceLooper, this);
}
