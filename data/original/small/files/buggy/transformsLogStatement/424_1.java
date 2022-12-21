@java.lang.Override
public void onPictureTaken(byte[] data, android.hardware.Camera camera) {
    System.out.println("log");
    mCameraListener.onPictureTaken(data);
    capturingImage = false;
    camera.startPreview();
}
