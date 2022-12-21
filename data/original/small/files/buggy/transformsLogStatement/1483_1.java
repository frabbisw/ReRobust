private void initializeRobot() throws java.lang.Exception, java.lang.IllegalStateException, java.lang.InterruptedException {
    InitializeServos();
    InitializeSensors();
    InitializeMenu();
    System.out.println("log");
    InitializeMotors();
}
