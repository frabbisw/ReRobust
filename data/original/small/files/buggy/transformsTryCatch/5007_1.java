@java.lang.SuppressWarnings(value = "unused")
public void setCircleRadius(int radius) {
    mInnerRadius = radius;
    try {
        mRadius = (mInnerRadius) + (com.licrafter.tagview.utils.DipConvertUtils.dip2px(getContext(), 4));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    invalidate();
}
