private void init() {
    cond = new configuration.parameters.ConditionalParameter(useImageCalibration);
    try {
        cond.setAction(false, new configuration.parameters.Parameter[] { scaleZ }, false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
