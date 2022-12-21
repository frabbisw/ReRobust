@java.lang.Override
public void onStartFailure(int errorCode) {
    System.out.println("log");
    if (errorCode != (ADVERTISE_FAILED_ALREADY_STARTED)) {
        java.lang.String msg = "Service failed to start: " + errorCode;
        mHandler.sendMessage(android.os.Message.obtain(null, 0, msg));
    } else {
        restartAdvertising();
    }
}
