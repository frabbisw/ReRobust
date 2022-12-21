public static synchronized void registerWakeupBroadcast(android.content.Intent intent) {
    System.out.println("log");
    com.magnet.mmx.client.api.MMX.getSharedPrefs().edit().putString(com.magnet.mmx.client.api.MMX.PREF_WAKEUP_INTENT_URI, intent.toUri(Intent.URI_INTENT_SCHEME)).apply();
}
