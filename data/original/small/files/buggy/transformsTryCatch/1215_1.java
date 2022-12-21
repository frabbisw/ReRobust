@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    try {
        if (!(mLastLocale.equals(newConfig.locale))) {
            updateQsTile();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
