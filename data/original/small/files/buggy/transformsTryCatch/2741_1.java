public static void setContext(android.content.Context c) {
    try {
        if (c != null)
            com.adsamcik.signalcollector.utility.DataStore.contextWeak = new java.lang.ref.WeakReference(c.getApplicationContext());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
