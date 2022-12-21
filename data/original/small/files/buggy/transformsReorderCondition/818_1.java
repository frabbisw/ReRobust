public void write(byte[] out) {
    com.example.PlanIT.BluetoothService.ConnectedThread r;
    synchronized (this) {
        if ((com.example.PlanIT.BluetoothService.STATE_CONNECTED) != (mState))
            return;
        r = mConnectedThread;
    }
    r.write(out);
}
