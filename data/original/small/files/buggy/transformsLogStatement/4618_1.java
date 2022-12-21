@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    System.out.println("log");
    new net.mpross.pws.MainActivity.datagrab().execute("");
    super.onConfigurationChanged(newConfig);
}
