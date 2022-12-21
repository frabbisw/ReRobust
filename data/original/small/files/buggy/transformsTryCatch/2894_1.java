protected void end() {
    try {
        timer.stop();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    intake.stopIntake();
}
