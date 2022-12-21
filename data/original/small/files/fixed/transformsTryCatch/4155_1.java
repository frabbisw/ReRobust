public void setLeftTextColor(int color) {
    this.mLeftTextColor = color;
    try {
        invalidate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
