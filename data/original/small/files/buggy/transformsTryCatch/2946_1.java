private static void onAccountCreated(android.accounts.Account newAccount, android.content.Context context) {
    com.upenn.chriswang1990.sunshine.sync.SunshineSyncAdapter.configurePeriodicSync(context, com.upenn.chriswang1990.sunshine.sync.SunshineSyncAdapter.SYNC_INTERVAL, com.upenn.chriswang1990.sunshine.sync.SunshineSyncAdapter.SYNC_FLEXTIME);
    try {
        android.content.ContentResolver.setSyncAutomatically(newAccount, context.getString(R.string.content_authority), true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.upenn.chriswang1990.sunshine.sync.SunshineSyncAdapter.syncImmediately(context);
}
