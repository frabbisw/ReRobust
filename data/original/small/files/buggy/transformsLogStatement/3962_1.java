public void startVelocity() {
    vectorDriveActive = true;
    driveThreadActive = true;
    System.out.println("log");
    if (!(driveThread.isAlive()))
        driveThread.start();
}
