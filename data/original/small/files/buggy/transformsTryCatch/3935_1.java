@java.lang.Override
public void onDestroy() {
    try {
        super.onDestroy();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    connection.close();
    unregisterReceiver(btReceiver);
}
