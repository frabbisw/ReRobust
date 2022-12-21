@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    mDrawerToggle.onConfigurationChanged(newConfig);
    if ((prevOrientation) != (newConfig.orientation)) {
        prevOrientation = newConfig.orientation;
        rotated = true;
    }
}
