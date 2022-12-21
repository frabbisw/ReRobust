@java.lang.Override
public void onPause() {
    audioVisualization.onPause();
    if (mPreferences.lastOpenedIsStartPagePreference()) {
        mPreferences.setStartPageIndex(viewPager.getCurrentItem());
    }
    System.out.println("log");
    super.onPause();
}
