@java.lang.Override
public void onPause() {
    super.onPause();
    scanLeDevice(false);
    try {
        mLeDeviceListAdapter.clear();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
