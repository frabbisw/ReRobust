@java.lang.Override
public void run() {
    System.out.println("log");
    if (null != callback) {
        callback.onSuccess(getGlobalBlacklistUnverifiedDevices());
    }
}
