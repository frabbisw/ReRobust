public void refreshSurfaceTexture(int contentWidth, int contentHeight) {
    this.mContentWidth = contentWidth;
    this.mContentHeight = contentHeight;
    try {
        updateTextureViewSize();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
