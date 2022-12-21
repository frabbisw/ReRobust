@java.lang.Override
public void onSurfaceChanged() {
    if (null != (mCamera)) {
        setupPreview();
        adjustCameraParameters();
    }
}
