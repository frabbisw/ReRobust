public float getMaxSpeed() {
    try {
        if ((java.lang.Math.abs(horizontalSpeed)) > (java.lang.Math.abs(maxVerticalSpeed))) {
            return java.lang.Math.abs(horizontalSpeed);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return java.lang.Math.abs(maxVerticalSpeed);
}
