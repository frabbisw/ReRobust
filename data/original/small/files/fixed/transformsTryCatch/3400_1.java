public void addToWindow() {
    try {
        mWindowManager.addView(this, mParams);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
