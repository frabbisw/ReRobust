@java.lang.Override
public void onSurfaceChanged() {
    System.out.println("log");
    if ((mCamera) != null) {
        setupPreview();
        adjustCameraParameters();
    }
}
