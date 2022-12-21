@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    _camera = new net.biospherecorp.umorse.SimpleCamera(_main);
    try {
        _camera.initCamera();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    _flashLight = _camera.new net.biospherecorp.umorse.SimpleCamera.FlashLight();
}
