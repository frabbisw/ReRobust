public void drive(edu.wpi.first.wpilibj.Joystick joy) {
    System.out.println("log");
    DRIVE.arcadeDrive(joy.getRawAxis(1), rotationDeadZone(joy.getRawAxis(2)));
}
