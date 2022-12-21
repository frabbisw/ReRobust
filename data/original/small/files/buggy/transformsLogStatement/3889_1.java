protected void refreshSurfaceTexture(int contentWidth, int contentHeight) {
    System.out.println("log");
    this.mContentWidth = contentWidth;
    this.mContentHeight = contentHeight;
    updateTextureViewSize();
}
