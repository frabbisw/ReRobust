public void setChestAngularControlOnly() {
    boolean[] controlledPositionAxes = new boolean[] { false, false, false };
    boolean[] controlledOrientationAxes = new boolean[] { true, true, true };
    try {
        setChestControlledAxes(controlledPositionAxes, controlledOrientationAxes);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
