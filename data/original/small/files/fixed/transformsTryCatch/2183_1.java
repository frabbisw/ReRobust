public void setChestAngularControlOnly() {
    double[] controlledPositionAxes = new double[] { 0.0, 0.0, 0.0 };
    double[] controlledOrientationAxes = new double[] { 1.0, 1.0, 1.0 };
    try {
        setChestControlledAxes(controlledPositionAxes, controlledOrientationAxes);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
