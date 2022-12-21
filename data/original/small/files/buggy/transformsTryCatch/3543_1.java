public void init(android.hardware.Camera camera) {
    try {
        setCamera(camera);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mAutoFocusHandler = new android.os.Handler();
    getHolder().addCallback(this);
    getHolder().setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
}
