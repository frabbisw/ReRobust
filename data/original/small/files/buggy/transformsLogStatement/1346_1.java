public void setResolution() {
    disconnectCamera();
    System.out.println("log");
    mMaxHeight = 240;
    mMaxWidth = 320;
    connectCamera(getWidth(), getHeight());
}
