@java.lang.Override
public void onStartFailure(int errorCode) {
    if ((ADVERTISE_FAILED_ALREADY_STARTED) != errorCode) {
        java.lang.String msg = "Service failed to start: " + errorCode;
        mHandler.sendMessage(android.os.Message.obtain(null, 0, msg));
    } else {
        restartAdvertising();
    }
}
