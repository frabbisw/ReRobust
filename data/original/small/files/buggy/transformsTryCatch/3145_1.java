public void registerNetworkReceiver() {
    android.content.IntentFilter filter = new android.content.IntentFilter();
    filter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
    try {
        filter.addAction(LocationManager.PROVIDERS_CHANGED_ACTION);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    registerReceiver(mNetworkStateReceiver, filter);
}
