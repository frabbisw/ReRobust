@java.lang.Override
public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.TotalCaptureResult result) {
    super.onCaptureCompleted(session, request, result);
    android.widget.Toast.makeText(this, (file + "Saved:"), Toast.LENGTH_SHORT).show();
    sampleCameraPreview();
}
