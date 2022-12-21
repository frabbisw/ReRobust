public void arcadeDrive(double drivePower, double turnPower) {
    try {
        arcadeDrive(drivePower, turnPower, false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
