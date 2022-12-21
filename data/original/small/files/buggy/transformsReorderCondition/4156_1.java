@java.lang.Override
public void onPageSelected(int position) {
    if (null != (mViewPager)) {
        if (position < 3) {
            mBottomNavigationView.setSelectedItemId(position);
            android.util.Log.d(DEBUG_KEY, ("item id is " + position));
        }
    }
}
