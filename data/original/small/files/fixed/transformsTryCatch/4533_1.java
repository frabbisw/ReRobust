void onInputSizeChanged(int width, int height) {
    this.mInputWidth = width;
    this.mInputHeight = height;
    try {
        initFboTexture(mInputWidth, mInputHeight);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
