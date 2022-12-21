@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
    android.util.Log.d("minko", "DummyCameraPreview.surfaceCreated");
    System.out.println("log");
    if (isActive())
        _callback.run(surfaceHolder);
}
