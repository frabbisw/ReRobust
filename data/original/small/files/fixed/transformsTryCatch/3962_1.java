public void startVelocity() {
    vectorDriveActive = true;
    driveThreadActive = true;
    try {
        driveThread.start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
