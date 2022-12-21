@java.lang.Override
public void onPageScrollStateChanged(int state) {
    try {
        if ((mListener) != null)
            mListener.onPageScrollStateChanged(state);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (state == (android.support.v4.view.ViewPager.SCROLL_STATE_IDLE))
        mIsClick = false;
}
