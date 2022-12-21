@java.lang.Override
public void onDestroy() {
    try {
        unregisterReceiver(mConnectionReceiver);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    destroyService();
    super.onDestroy();
}
