@java.lang.Override
protected void onPause() {
    try {
        super.onPause();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    scanLeDevice(false);
    mLeDeviceListAdapter.clear();
}
