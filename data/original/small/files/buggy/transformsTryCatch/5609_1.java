@java.lang.Override
public void onCreate() {
    try {
        mBluetoothAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((mBluetoothAdapter) == null) {
        java.lang.System.exit(0);
    }
    smokinoGUI = null;
    super.onCreate();
}
