public void runCalibrateCapture() {
    try {
        new java.lang.Thread(new PositivePosture.CalibrateCapture()).start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
