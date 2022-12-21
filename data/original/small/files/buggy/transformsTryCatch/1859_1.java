protected void end() {
    try {
        edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("Distance Change", ((org.usfirst.frc.team3130.robot.subsystems.Chassis.GetDistance()) - (prevDist)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.usfirst.frc.team3130.robot.subsystems.Chassis.ReleaseAngle();
    org.usfirst.frc.team3130.robot.subsystems.Chassis.DriveTank(0, 0);
}
