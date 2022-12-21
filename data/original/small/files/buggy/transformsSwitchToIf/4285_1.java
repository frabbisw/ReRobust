private com.kontakt.sdk.android.ble.configuration.ScanMode getScanMode(int mode, com.facebook.react.bridge.Promise promise) throws java.lang.Exception {
    if (mode == 0) {
        return com.kontakt.sdk.android.ble.configuration.ScanMode.LOW_POWER;
    } else if (mode == 1) {
        return com.kontakt.sdk.android.ble.configuration.ScanMode.BALANCED;
    } else if (mode == 2) {
        return com.kontakt.sdk.android.ble.configuration.ScanMode.LOW_LATENCY;
    } else {
        throw new java.lang.Exception("The value of scanMode has to be either LOW_POWER, BALANCED or LOW_LATENCY");
    }
}
