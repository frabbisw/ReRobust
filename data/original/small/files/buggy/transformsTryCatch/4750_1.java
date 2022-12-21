@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    mFaceDetect.removeAllViews();
    mPreviewContainer.removeView(mPreview);
    try {
        mCameraSource.release();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
