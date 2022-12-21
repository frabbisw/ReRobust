@java.lang.Override
public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.TotalCaptureResult result) {
    try {
        super.onCaptureCompleted(session, request, result);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    sampleCameraPreview();
}
