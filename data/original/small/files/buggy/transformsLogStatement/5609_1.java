@java.lang.Override
public void onCreate() {
    mBluetoothAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
    if ((mBluetoothAdapter) == null) {
        java.lang.System.exit(0);
    }
    System.out.println("log");
    smokinoGUI = null;
    super.onCreate();
}
