@java.lang.Override
public void onClick(android.view.View v) {
    mCamera = mPreview.changeCamera();
    try {
        flashMode = mCamera.getParameters().getFlashMode();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((flashMode) == null) {
        flashEnabled = false;
        flashButton.setSelected(false);
    }
}
