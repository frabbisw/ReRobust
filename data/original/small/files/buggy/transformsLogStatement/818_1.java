public void write(byte[] out) {
    com.example.PlanIT.BluetoothService.ConnectedThread r;
    System.out.println("log");
    synchronized (this) {
        if ((mState) != (com.example.PlanIT.BluetoothService.STATE_CONNECTED))
            return;
        r = mConnectedThread;
    }
    r.write(out);
}
