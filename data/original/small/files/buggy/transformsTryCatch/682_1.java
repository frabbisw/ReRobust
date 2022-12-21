@java.lang.Override
public void run() {
    try {
        mCryptoStore.setGlobalBlacklistUnverifiedDevices(block);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (null != callback) {
        callback.onSuccess(null);
    }
}
