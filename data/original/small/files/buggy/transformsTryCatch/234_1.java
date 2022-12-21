@java.lang.Override
public void onPause() {
    try {
        audioVisualization.onPause();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (mPreferences.lastOpenedIsStartPagePreference()) {
        mPreferences.setStartPageIndex(viewPager.getCurrentItem());
    }
    super.onPause();
}
