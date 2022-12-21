@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    try {
        new net.mpross.pws.MainActivity.datagrab().execute("");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
