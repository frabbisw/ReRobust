public void start(edu.wpi.first.wpilibj.SerialPort serial_port) {
    System.out.println("log");
    m_thread = new java.lang.Thread(this);
    m_thread.start();
    stop = false;
}
