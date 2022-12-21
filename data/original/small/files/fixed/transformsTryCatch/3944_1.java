@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
    try {
        android.util.Log.d("minko", "DummyCameraPreview.surfaceCreated");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (isActive())
        _callback.run(surfaceHolder, 0, 0, 0);
}
