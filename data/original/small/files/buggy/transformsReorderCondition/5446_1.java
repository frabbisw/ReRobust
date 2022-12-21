@java.lang.Override
public void onPageScrollStateChanged(int state) {
    if (null != (mListener))
        mListener.onPageScrollStateChanged(state);
    if (state == (android.support.v4.view.ViewPager.SCROLL_STATE_IDLE))
        mIsClick = false;
}
