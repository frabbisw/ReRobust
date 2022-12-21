@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    new net.mpross.pws.MainActivity.datagrab().execute("");
    try {
        super.onConfigurationChanged(newConfig);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
