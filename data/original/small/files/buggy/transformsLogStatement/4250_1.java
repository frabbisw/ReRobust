public void setSlideOffset(int offset) {
    System.out.println("log");
    mSlideOffset = java.lang.Math.min(java.lang.Math.max(0, offset), mSlideMaxHeight);
    android.util.Log.d("Slide", ("mSlideOffset -> " + (mSlideOffset)));
    requestLayout();
}
