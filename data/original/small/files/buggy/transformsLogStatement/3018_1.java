@java.lang.Override
public void onConnectionSuspended(int i) {
    System.out.println("log");
    showMessage((("onConnectionSuspended(" + i) + ")"));
    android.util.Log.w(name.chadschultz.nearbyapidemo.MainActivity.TAG, (("onConnectionSuspended(" + i) + ")"));
}
