@java.lang.Override
public void onPageSelected(int position) {
    try {
        if ((mViewPager) != null) {
            if (position < 3) {
                mBottomNavigationView.setSelectedItemId(position);
                android.util.Log.d(DEBUG_KEY, ("item id is " + position));
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
