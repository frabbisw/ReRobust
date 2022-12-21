@java.lang.Override
protected void onPause() {
    super.onPause();
    scanLeDevice(false);
    System.out.println("log");
    mLeDeviceListAdapter.clear();
}
