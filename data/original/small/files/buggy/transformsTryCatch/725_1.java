public void startRecording() {
    log.info("Start recording");
    try {
        scaledDistanceFilter = config.getDistanceFilter();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setPace(false);
}
