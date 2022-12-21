@java.lang.Override
public void teleopPeriodic() {
    try {
        edu.wpi.first.wpilibj.command.Scheduler.getInstance().run();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
