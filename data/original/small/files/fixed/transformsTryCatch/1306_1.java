@java.lang.Override
public void onTabSelected(android.support.design.widget.TabLayout.Tab tab) {
    try {
        viewPager.setCurrentItem(tab.getPosition());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
