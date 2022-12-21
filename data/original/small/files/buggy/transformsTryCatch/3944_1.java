@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
    android.util.Log.d("minko", "DummyCameraPreview.surfaceCreated");
    try {
        if (isActive())
            _callback.run(surfaceHolder);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
