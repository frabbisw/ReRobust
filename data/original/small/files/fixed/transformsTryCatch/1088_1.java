@java.lang.Override
public void onTabSelected(android.support.design.widget.TabLayout.Tab tab) {
    viewPager.setCurrentItem(tab.getPosition());
    try {
        if ((viewPagerAdapter.getCurrentFragment()) != null) {
            viewPagerAdapter.getCurrentFragment().onResume();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
