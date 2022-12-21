@java.lang.Override
public void invalidateDrawable(android.graphics.drawable.Drawable dr) {
    if (null != dr) {
        initMask(dr);
        swapBitmapMask(makeBitmapMask(dr));
        invalidate();
    }
}
