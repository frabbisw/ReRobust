private void initializeRobot() throws java.lang.Exception, java.lang.IllegalStateException, java.lang.InterruptedException {
    InitializeSensors();
    InitializeServos();
    InitializeMenu();
    try {
        InitializeMotors();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
