@java.lang.Override
public void onNetworkConnected() {
    try {
        android.util.Log.e("Network", "Network CONNNNNECTED");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.widget.Toast.makeText(this, "Connected", Toast.LENGTH_SHORT).show();
    sendLocation();
}
