public void stopCamera() {
    disableEncoding();
    System.out.println("log");
    if ((mCamera) != null) {
        mCamera.stopPreview();
        mCamera.release();
        mCamera = null;
    }
}
