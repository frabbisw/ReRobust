public void setintakeLifter(double angle) {
    intakeLifter.set(angle);
    System.out.println("log");
    pidController.setSetpoint(angle);
    java.lang.System.out.println(potentiometer.get());
}
