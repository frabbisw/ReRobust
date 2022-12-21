@java.lang.Override
public void run() {
    System.out.println("log");
    mCryptoStore.setGlobalBlacklistUnverifiedDevices(block);
    if (null != callback) {
        callback.onSuccess(null);
    }
}
