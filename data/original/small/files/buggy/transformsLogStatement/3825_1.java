@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.net.ConnectivityManager connMgr = ((android.net.ConnectivityManager) (getActivity().getSystemService(Context.CONNECTIVITY_SERVICE)));
    System.out.println("log");
    android.net.NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
}
