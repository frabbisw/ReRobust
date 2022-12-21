@java.lang.Override
public void onFailure(int reasonCode) {
    try {
        android.widget.Toast.makeText(getApplicationContext(), "Peer Discovery not ready", Toast.LENGTH_SHORT).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.util.Log.d("WiFiDBC", "Peer Discovery not ready");
}
