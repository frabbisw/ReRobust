public void drive(edu.wpi.first.wpilibj.Joystick joy) {
    try {
        DRIVE.arcadeDrive((-(joy.getRawAxis(1))), (-(rotationDeadZone(joy.getRawAxis(2)))));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
