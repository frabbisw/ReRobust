public void stopCamera() {
    try {
        disableEncoding();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((mCamera) != null) {
        mCamera.stopPreview();
        mCamera.release();
        mCamera = null;
    }
}
