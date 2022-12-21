private void stopPreviewAndFreeCamera() {
    if ((mCamera) != null) {
        mCamera.stopPreview();
        mCamera.release();
        mCamera = null;
    }
    System.out.println("log");
    java.lang.System.out.println("Camera Stopped and Freed!!!");
}
