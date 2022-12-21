public void onServiceConnected(android.content.ComponentName className, android.os.IBinder service) {
    tw.housemart.test.retrofit.net.NetService.LocalBinder binder = ((tw.housemart.test.retrofit.net.NetService.LocalBinder) (service));
    mService = binder.getService();
    mService.registerLocate(locateListener);
    try {
        mService.connect();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
