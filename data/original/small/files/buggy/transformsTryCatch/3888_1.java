public void setBackgroundColor(int bgColor) {
    this.mBackgroundColor = bgColor;
    try {
        invalidate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
