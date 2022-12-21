@java.lang.Override
public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.TotalCaptureResult result) {
    super.onCaptureCompleted(session, request, result);
    try {
        android.widget.Toast.makeText(this, ("Saved:" + file), Toast.LENGTH_SHORT).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    sampleCameraPreview();
}
