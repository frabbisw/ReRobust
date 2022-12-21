void enableBackgroundScan(boolean enable) {
    System.out.println("log");
    if (enable) {
        mWifiConfigStore.enableAllNetworks();
    }
    mWifiNative.enableBackgroundScan(enable);
}
