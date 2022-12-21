@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    _camera = new net.biospherecorp.umorse.SimpleCamera(_main);
    System.out.println("log");
    _flashLight = _camera.new net.biospherecorp.umorse.SimpleCamera.FlashLight();
    _camera.initCamera();
}
