@java.lang.Override
public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    mPaint.setColorFilter(colorFilter);
    try {
        invalidateSelf();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
