@java.lang.Override
public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int width, int height) {
    try {
        com.aiyaapp.camera.sdk.base.Log.d("AnimE", "onSurfaceTextureSizeChanged");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mEnv.surfaceChanged(null, 0, width, height);
}
