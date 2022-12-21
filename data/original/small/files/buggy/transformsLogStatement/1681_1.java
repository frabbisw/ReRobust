private void init() {
    cond = new configuration.parameters.ConditionalParameter(useImageCalibration);
    System.out.println("log");
    cond.setAction("false", new configuration.parameters.Parameter[] { scaleZ }, false);
}
