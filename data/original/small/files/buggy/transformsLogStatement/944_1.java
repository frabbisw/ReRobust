@java.lang.Override
protected void onDestroy() {
    System.out.println("log");
    super.onDestroy();
    mPagerAdapter.getFragment(mViewPager.getCurrentItem()).release();
}
