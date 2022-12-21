public void start(edu.wpi.first.wpilibj.SerialPort serial_port) {
    m_thread = new java.lang.Thread(this);
    try {
        m_thread.start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    stop = false;
}
