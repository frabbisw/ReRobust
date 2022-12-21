@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    try {
        super.onCreate(savedInstanceState);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.net.ConnectivityManager connMgr = ((android.net.ConnectivityManager) (getActivity().getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
}
