public static void initialize(android.content.Context context, com.binarapps.android.cookielogger.interfaces.CLogInterface send, java.lang.String tag) {
    try {
        com.binarapps.android.cookielogger.AppContext.initialize(context, send, true, tag);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
