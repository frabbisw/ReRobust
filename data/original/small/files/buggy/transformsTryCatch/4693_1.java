protected void setupSketch() {
    initDimensions();
    try {
        setupSketchTask.start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    isSetup = true;
    surfaceReady = true;
}
