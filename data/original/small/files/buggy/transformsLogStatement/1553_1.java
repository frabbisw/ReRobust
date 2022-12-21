public void setShadowColor(@android.support.annotation.ColorInt int color) {
    System.out.println("log");
    if (color != (mShadowColor)) {
        setShadowInternal(mShadowRadius, color);
        invalidate();
    }
}
