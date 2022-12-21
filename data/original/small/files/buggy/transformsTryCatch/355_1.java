@java.lang.Override
public synchronized void enable() {
    m_enabled = true;
    m_initTime = edu.wpi.first.wpilibj.Timer.getFPGATimestamp();
    try {
        if ((table) != null) {
            table.putBoolean("enabled", true);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
