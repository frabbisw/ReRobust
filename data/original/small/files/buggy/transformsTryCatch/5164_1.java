private void stopPreviewAndFreeCamera() {
    if ((mCamera) != null) {
        mCamera.stopPreview();
        mCamera.release();
        mCamera = null;
    }
    try {
        java.lang.System.out.println("Camera Stopped and Freed!!!");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
