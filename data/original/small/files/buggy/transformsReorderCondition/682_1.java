@java.lang.Override
public void run() {
    mCryptoStore.setGlobalBlacklistUnverifiedDevices(block);
    if (callback != null) {
        callback.onSuccess(null);
    }
}
