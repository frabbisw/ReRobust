public static void log(java.lang.String origin, java.lang.String message) {
    java.io.File logFile = null;
    try {
        if (mega.privacy.android.app.utils.Util.DEBUG) {
            nz.mega.sdk.MegaApiAndroid.log(MegaApiAndroid.LOG_LEVEL_INFO, message, origin);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
