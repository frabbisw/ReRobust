@java.lang.Override
public void onClick(android.view.View v) {
    mCamera = mPreview.changeCamera();
    flashMode = mCamera.getParameters().getFlashMode();
    try {
        if ((flashMode) == null) {
            flashEnabled = false;
            flashButton.setSelected(flashEnabled);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
