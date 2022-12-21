public void onServiceConnected(android.content.ComponentName className, android.os.IBinder service) {
    tw.housemart.test.retrofit.net.NetService.LocalBinder binder = ((tw.housemart.test.retrofit.net.NetService.LocalBinder) (service));
    try {
        mService = binder.getService();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mService.connect();
    mService.registerLocate(locateListener);
}
