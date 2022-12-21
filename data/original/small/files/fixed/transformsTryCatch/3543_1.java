public void init(android.hardware.Camera camera) {
    setCamera(camera);
    getHolder().addCallback(this);
    try {
        getHolder().setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
