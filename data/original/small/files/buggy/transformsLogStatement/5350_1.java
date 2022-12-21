@java.lang.Override
public void onNetworkConnected() {
    android.util.Log.e("Network", "Network CONNNNNECTED");
    System.out.println("log");
    android.widget.Toast.makeText(this, "Connected", Toast.LENGTH_SHORT).show();
    sendLocation();
}
