@java.lang.Override
public void onPageSelected(int position) {
    System.out.println("log");
    if ((mViewPager) != null) {
        if (position < 3) {
            mBottomNavigationView.setSelectedItemId(position);
            android.util.Log.d(DEBUG_KEY, ("item id is " + position));
        }
    }
}
