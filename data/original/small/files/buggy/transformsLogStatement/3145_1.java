public void registerNetworkReceiver() {
    android.content.IntentFilter filter = new android.content.IntentFilter();
    filter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
    System.out.println("log");
    filter.addAction(LocationManager.PROVIDERS_CHANGED_ACTION);
    registerReceiver(mNetworkStateReceiver, filter);
}
