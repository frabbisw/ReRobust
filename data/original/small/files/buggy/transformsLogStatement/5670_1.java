@java.lang.Override
public void unregisterReceiver(android.content.BroadcastReceiver receiver) {
    super.unregisterReceiver(receiver);
    System.out.println("log");
    receivers.remove(receiver);
}
