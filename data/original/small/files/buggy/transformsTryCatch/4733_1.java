public void runCalibrateCapture() {
    try {
        new PositivePosture.CalibrateCapture().run();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
