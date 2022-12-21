public boolean isNetworkAvailable(android.content.Context context) {
    android.net.ConnectivityManager cm = ((android.net.ConnectivityManager) (context.getSystemService(Context.CONNECTIVITY_SERVICE)));
    return null != (cm.getActiveNetworkInfo());
}
