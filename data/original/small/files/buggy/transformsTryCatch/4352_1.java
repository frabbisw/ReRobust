@java.lang.Override
public void invalidateDrawable(android.graphics.drawable.Drawable dr) {
    try {
        if (dr != null) {
            initMask(dr);
            swapBitmapMask(makeBitmapMask(dr));
            invalidate();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
