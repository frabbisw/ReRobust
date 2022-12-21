@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    connection.close();
    System.out.println("log");
    unregisterReceiver(btReceiver);
}
