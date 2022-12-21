@java.lang.Override
public void onFailure(int reasonCode) {
    try {
        android.util.Log.d("WiFiDBC", "Peer Discovery not ready");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
