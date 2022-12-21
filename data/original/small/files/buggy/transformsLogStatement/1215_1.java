@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    System.out.println("log");
    super.onConfigurationChanged(newConfig);
    if (!(mLastLocale.equals(newConfig.locale))) {
        updateQsTile();
    }
}
