@java.lang.Override
public void onPageSelected(int position) {
    com.example.huangxueqin.zhihudaily.ui.widget.CirclePageIndicator.D((position + "current position = "));
    mCurrentOffset = 0;
    mCurrentPosition = position;
    invalidate();
}
