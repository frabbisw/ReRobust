@java.lang.Override
public void onPictureTaken(byte[] data, android.hardware.Camera camera) {
    try {
        synchronized (this) {
            mCameraListener.onPictureTaken(data);
            capturingImage = false;
            camera.startPreview();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
