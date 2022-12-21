@java.lang.Override
public void onPageScrollStateChanged(int state) {
    System.out.println("log");
    if ((mListener) != null)
        mListener.onPageScrollStateChanged(state);
    if (state == (android.support.v4.view.ViewPager.SCROLL_STATE_IDLE))
        mIsClick = false;
}
