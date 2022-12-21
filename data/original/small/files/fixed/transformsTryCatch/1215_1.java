@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    try {
        super.onConfigurationChanged(newConfig);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (!(newConfig.locale.equals(mLastLocale))) {
        updateQsTile();
    }
}
