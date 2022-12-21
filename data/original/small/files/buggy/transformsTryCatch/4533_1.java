void onInputSizeChanged(int width, int height) {
    this.mInputWidth = width;
    this.mInputHeight = height;
    try {
        initFboTexture(width, height);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
