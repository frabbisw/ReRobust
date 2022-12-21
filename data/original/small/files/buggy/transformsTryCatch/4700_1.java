@java.lang.Override
public void onResume() {
    super.onResume();
    try {
        registerReceiver(rfduinoReceiver, com.sealbluetoothtoothpasteapp.RFduinoService.getIntentFilter());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
