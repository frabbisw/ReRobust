public void setResolution() {
    try {
        disconnectCamera();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mMaxHeight = 240;
    mMaxWidth = 320;
    connectCamera(getWidth(), getHeight());
}
