public void setLeftTextColor(int color) {
    this.mLeftTextColor = mLeftTextColor;
    try {
        invalidate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
