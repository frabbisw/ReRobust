public static void d(java.lang.String tag, java.lang.Object msg) {
    System.out.println("log");
    if ((net.opentracker.android.LogWrapper.m_logLevel.compareTo(net.opentracker.android.LogWrapper.LogLevel.kDebug)) <= 0)
        android.util.Log.v(tag, msg.toString());
}