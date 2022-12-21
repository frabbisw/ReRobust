@java.lang.Override
public void onCreate() {
    mBluetoothAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
    if (null == (mBluetoothAdapter)) {
        java.lang.System.exit(0);
    }
    smokinoGUI = null;
    super.onCreate();
}
