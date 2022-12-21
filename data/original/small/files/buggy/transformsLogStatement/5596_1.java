@java.lang.Override
public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    mPaint.setColorFilter(colorFilter);
    System.out.println("log");
    invalidateSelf();
}
