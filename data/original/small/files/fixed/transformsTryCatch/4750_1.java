@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    try {
        if ((mCameraSource) != null) {
            mCameraSource.release();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
