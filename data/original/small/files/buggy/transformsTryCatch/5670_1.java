@java.lang.Override
public void unregisterReceiver(android.content.BroadcastReceiver receiver) {
    try {
        super.unregisterReceiver(receiver);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    receivers.remove(receiver);
}
