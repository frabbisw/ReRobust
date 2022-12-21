@java.lang.Override
public void onResume() {
    System.out.println("log");
    super.onResume();
    registerReceiver(rfduinoReceiver, com.sealbluetoothtoothpasteapp.RFduinoService.getIntentFilter());
}
