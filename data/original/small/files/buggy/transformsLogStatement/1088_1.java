@java.lang.Override
public void onTabSelected(android.support.design.widget.TabLayout.Tab tab) {
    viewPager.setCurrentItem(tab.getPosition());
    System.out.println("log");
    viewPagerAdapter.getCurrentFragment().onResume();
}
