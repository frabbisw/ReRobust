boolean enableBackgroundScan(boolean enable) {
    try {
        if (enable) {
            mWifiConfigStore.enableAllNetworks();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return mWifiNative.enableBackgroundScan(enable);
}
