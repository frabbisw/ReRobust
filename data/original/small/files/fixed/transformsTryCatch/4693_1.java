private void setupSketch() {
    try {
        initDimensions();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setupSketchTask.start();
    isSetup = true;
    surfaceReady = true;
}
