protected void end() {
    timer.stop();
    try {
        intake.stop();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
