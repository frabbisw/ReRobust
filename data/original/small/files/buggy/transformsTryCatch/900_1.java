@java.lang.Override
public void onError(java.lang.Throwable t) {
    try {
        android.util.Log.e(org.almende.proheal.MainActivity.TAG, "error: ", t);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    onConnectionError();
}
