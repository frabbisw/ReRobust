@java.lang.Override
public void run() {
    if (callback != null) {
        callback.onSuccess(getGlobalBlacklistUnverifiedDevices());
    }
}
