public void setShadowColor(@android.support.annotation.ColorInt int color) {
    try {
        if (color != (mShadowColor)) {
            setShadowInternal(mShadowRadius, color);
            invalidate();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
