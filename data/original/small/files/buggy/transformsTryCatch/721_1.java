public void setintakeLifter(double angle) {
    intakeLifter.set(angle);
    try {
        pidController.setSetpoint(angle);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println(potentiometer.get());
}
