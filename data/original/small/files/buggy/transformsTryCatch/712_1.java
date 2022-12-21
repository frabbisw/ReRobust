public void drive(edu.wpi.first.wpilibj.Joystick joy) {
    try {
        DRIVE.arcadeDrive((-(joy.getRawAxis(1))), (-(joy.getRawAxis(2))), true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
