public void setShadowColor(@android.support.annotation.ColorInt int color) {
    try {
        if (color != (mShadowColor)) {
            setShadowInternal(mShadowRadius, color, true);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
