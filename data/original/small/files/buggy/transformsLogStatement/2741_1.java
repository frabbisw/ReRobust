public static void setContext(android.content.Context c) {
    System.out.println("log");
    if (c != null)
        com.adsamcik.signalcollector.utility.DataStore.contextWeak = new java.lang.ref.WeakReference(c.getApplicationContext());
}
