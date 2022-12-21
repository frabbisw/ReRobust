@java.lang.Override
public void onConnectionSuspended(int i) {
    try {
        showMessage((("onConnectionSuspended(" + i) + ")"));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.util.Log.w(name.chadschultz.nearbyapidemo.MainActivity.TAG, (("onConnectionSuspended(" + i) + ")"));
}
