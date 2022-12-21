void onInputSizeChanged(int width, int height) {
    this.mInputWidth = width;
    System.out.println("log");
    this.mInputHeight = height;
    initFboTexture(width, height);
}
