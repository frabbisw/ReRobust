@java.lang.Override
public void onClick(android.view.View view) {
    if ((!(isMediaPlayerStarted)) && (!(isSettlingProcess))) {
        ominext.com.readmestories.fragments.ReadingBookFragment fragment = mPagerAdapter.getFragment(mViewPager.getCurrentItem());
        fragment.onPlayClick();
    }
}
