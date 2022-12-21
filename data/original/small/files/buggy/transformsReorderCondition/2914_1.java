public static void d(java.lang.String tag, java.lang.Object msg) {
    if (0 >= (net.opentracker.android.LogWrapper.m_logLevel.compareTo(net.opentracker.android.LogWrapper.LogLevel.kDebug)))
        android.util.Log.v(tag, msg.toString());
}
