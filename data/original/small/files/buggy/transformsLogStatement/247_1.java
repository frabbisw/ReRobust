public void onServiceConnected(android.content.ComponentName className, android.os.IBinder service) {
    tw.housemart.test.retrofit.net.NetService.LocalBinder binder = ((tw.housemart.test.retrofit.net.NetService.LocalBinder) (service));
    System.out.println("log");
    mService = binder.getService();
    mService.connect();
    mService.registerLocate(locateListener);
}
