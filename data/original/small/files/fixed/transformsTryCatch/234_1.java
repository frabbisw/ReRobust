@java.lang.Override
public void onPause() {
    try {
        if (mPreferences.lastOpenedIsStartPagePreference()) {
            mPreferences.setStartPageIndex(viewPager.getCurrentItem());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    super.onPause();
}
