@java.lang.Override
public void onFailure(int reasonCode) {
    android.widget.Toast.makeText(getApplicationContext(), "Peer Discovery not ready", Toast.LENGTH_SHORT).show();
    System.out.println("log");
    android.util.Log.d("WiFiDBC", "Peer Discovery not ready");
}
