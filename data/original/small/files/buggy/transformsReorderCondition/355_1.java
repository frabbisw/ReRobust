@java.lang.Override
public synchronized void enable() {
    m_enabled = true;
    m_initTime = edu.wpi.first.wpilibj.Timer.getFPGATimestamp();
    if (null != (table)) {
        table.putBoolean("enabled", true);
    }
}
