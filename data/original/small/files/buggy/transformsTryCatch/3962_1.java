public void startVelocity() {
    vectorDriveActive = true;
    driveThreadActive = true;
    try {
        if (!(driveThread.isAlive()))
            driveThread.start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
