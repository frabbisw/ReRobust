private boolean checkConnection() {
    android.net.ConnectivityManager connectivityManager = ((android.net.ConnectivityManager) (getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
    if (null == networkInfo) {
        return false;
    }
    return true;
}
