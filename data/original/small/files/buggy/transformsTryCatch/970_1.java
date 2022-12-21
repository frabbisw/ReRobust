@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    try {
        super.onConfigurationChanged(newConfig);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mDrawerToggle.onConfigurationChanged(newConfig);
    if ((newConfig.orientation) != (prevOrientation)) {
        prevOrientation = newConfig.orientation;
        rotated = true;
    }
}
