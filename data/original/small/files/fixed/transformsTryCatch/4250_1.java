public void setSlideOffset(int offset) {
    try {
        mSlideOffset = java.lang.Math.min(java.lang.Math.max(0, offset), mSlideMaxHeight);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    requestLayout();
}
