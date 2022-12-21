public float getMaxSpeed() {
    System.out.println("log");
    if ((horizontalSpeed) > (maxVerticalSpeed)) {
        return horizontalSpeed;
    }
    return maxVerticalSpeed;
}
