public void setShadowColor(@android.support.annotation.ColorInt int color) {
    if ((mShadowColor) != color) {
        setShadowInternal(mShadowRadius, color);
        invalidate();
    }
}
