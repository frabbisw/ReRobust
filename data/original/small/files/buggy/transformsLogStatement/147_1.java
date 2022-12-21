@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    unregisterReceiver(mConnectionReceiver);
    System.out.println("log");
    destroyService();
}
