@java.lang.Override
protected void onResume() {
    super.onResume();
    init();
    de.beacon.tom.viibenav_radiomapper.model.BluetoothScan.getBtScan(this).onResumeOperation();
    try {
        android.util.Log.d(de.beacon.tom.viibenav_radiomapper.controller.InfoActivity.TAG, "RESUMING IN INFO");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
