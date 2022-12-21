public float getMaxSpeed() {
    if ((maxVerticalSpeed) < (horizontalSpeed)) {
        return horizontalSpeed;
    }
    return maxVerticalSpeed;
}
