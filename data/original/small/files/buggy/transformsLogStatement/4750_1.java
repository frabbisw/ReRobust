@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    mFaceDetect.removeAllViews();
    System.out.println("log");
    mPreviewContainer.removeView(mPreview);
    mCameraSource.release();
}
