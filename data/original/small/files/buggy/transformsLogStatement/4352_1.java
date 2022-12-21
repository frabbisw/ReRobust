@java.lang.Override
public void invalidateDrawable(android.graphics.drawable.Drawable dr) {
    System.out.println("log");
    if (dr != null) {
        initMask(dr);
        swapBitmapMask(makeBitmapMask(dr));
        invalidate();
    }
}
