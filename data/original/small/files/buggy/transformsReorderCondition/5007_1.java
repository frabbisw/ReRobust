@java.lang.SuppressWarnings(value = "unused")
public void setCircleRadius(int radius) {
    mInnerRadius = radius;
    mRadius = (com.licrafter.tagview.utils.DipConvertUtils.dip2px(getContext(), 4)) + (mInnerRadius);
    invalidate();
}
