@java.lang.Override
public void run() {
    try {
        edu.wpi.first.wpilibj.command.Scheduler.getInstance().run();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
