private void initializeRobot() throws java.lang.Exception, java.lang.IllegalStateException, java.lang.InterruptedException {
    InitializeServos();
    InitializeSensors();
    try {
        InitializeMenu();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    InitializeMotors();
}
