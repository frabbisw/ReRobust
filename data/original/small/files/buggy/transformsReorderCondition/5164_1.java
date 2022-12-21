private void stopPreviewAndFreeCamera() {
    if (null != (mCamera)) {
        mCamera.stopPreview();
        mCamera.release();
        mCamera = null;
    }
    java.lang.System.out.println("Camera Stopped and Freed!!!");
}
