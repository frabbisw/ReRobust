@java.lang.Override
public void run() {
    try {
        if (null != callback) {
            callback.onSuccess(getGlobalBlacklistUnverifiedDevices());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
