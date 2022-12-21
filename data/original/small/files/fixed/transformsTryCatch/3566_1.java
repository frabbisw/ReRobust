@java.lang.Override
protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    try {
        super.onSizeChanged(w, h, oldw, oldh);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    width = w;
    height = h;
}
