public void driveRaw(double leftPower, double rightPower) {
    try {
        frontleft.set(leftSpeed);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    frontright.set(rightSpeed);
}
