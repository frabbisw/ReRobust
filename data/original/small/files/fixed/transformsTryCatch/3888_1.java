public void setBackgroundColor(int bgColor) {
    this.mBackgroundColor = bgColor;
    try {
        super.setBackgroundColor(this.mBackgroundColor);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    invalidate();
}
