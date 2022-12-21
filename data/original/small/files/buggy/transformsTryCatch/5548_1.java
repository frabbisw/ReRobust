@java.lang.Override
public void onSurfaceChanged() {
    try {
        if ((mCamera) != null) {
            setupPreview();
            adjustCameraParameters();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
