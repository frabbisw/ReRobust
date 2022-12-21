@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    try {
        unregisterReceiver(mConnectionReceiver);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    destroyService();
}
