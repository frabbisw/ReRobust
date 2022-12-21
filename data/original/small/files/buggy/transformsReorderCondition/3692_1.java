@java.lang.Override
public void onClick(android.view.View v) {
    mCamera = mPreview.changeCamera();
    flashMode = mCamera.getParameters().getFlashMode();
    if (null == (flashMode)) {
        flashEnabled = false;
        flashButton.setSelected(flashEnabled);
    }
}
