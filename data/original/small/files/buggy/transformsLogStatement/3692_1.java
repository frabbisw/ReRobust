@java.lang.Override
public void onClick(android.view.View v) {
    mCamera = mPreview.changeCamera();
    flashMode = mCamera.getParameters().getFlashMode();
    System.out.println("log");
    if ((flashMode) == null) {
        flashEnabled = false;
        flashButton.setSelected(flashEnabled);
    }
}
