@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    try {
        mPagerAdapter.getFragment(mViewPager.getCurrentItem()).release();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
