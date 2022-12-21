public void driveRaw(double leftPower, double rightPower) {
    frontleft.set(leftPower);
    try {
        frontright.set(rightPower);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
