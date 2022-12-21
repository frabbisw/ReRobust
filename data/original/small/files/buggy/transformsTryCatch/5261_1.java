@java.lang.Override
public void onPageSelected(int position) {
    try {
        com.example.huangxueqin.zhihudaily.ui.widget.CirclePageIndicator.D(("current position = " + position));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mCurrentOffset = 0;
    mCurrentPosition = position;
    invalidate();
}
