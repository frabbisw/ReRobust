private void DriveSmooth() {
    try {
        motorLinks.rotate(90, true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    motorRechts.rotate(90, false);
}
