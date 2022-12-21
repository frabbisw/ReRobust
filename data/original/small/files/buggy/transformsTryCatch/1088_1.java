@java.lang.Override
public void onTabSelected(android.support.design.widget.TabLayout.Tab tab) {
    viewPager.setCurrentItem(tab.getPosition());
    try {
        viewPagerAdapter.getCurrentFragment().onResume();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
