@java.lang.Override
public void onPageSelected(int position) {
    try {
        currentTab = mViewPager.getCurrentItem();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
