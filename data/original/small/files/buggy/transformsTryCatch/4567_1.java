void enableBackgroundScan(boolean enable) {
    try {
        if (enable) {
            mWifiConfigStore.enableAllNetworks();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mWifiNative.enableBackgroundScan(enable);
}
