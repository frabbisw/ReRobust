private void DriveSmooth() {
    motorLinks.rotate(90, true);
    try {
        motorRechts.rotate(90, true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
