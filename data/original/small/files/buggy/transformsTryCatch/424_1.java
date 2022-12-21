@java.lang.Override
public void onPictureTaken(byte[] data, android.hardware.Camera camera) {
    try {
        mCameraListener.onPictureTaken(data);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    capturingImage = false;
    camera.startPreview();
}
