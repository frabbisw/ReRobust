public void registerNetworkReceiver() {
    android.content.IntentFilter filter = new android.content.IntentFilter();
    filter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
    try {
        registerReceiver(mNetworkStateReceiver, filter);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
