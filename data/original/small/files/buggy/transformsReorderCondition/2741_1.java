public static void setContext(android.content.Context c) {
    if (null != c)
        com.adsamcik.signalcollector.utility.DataStore.contextWeak = new java.lang.ref.WeakReference(c.getApplicationContext());
}
