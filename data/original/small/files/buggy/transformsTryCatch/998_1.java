protected void execute() {
    double output = Robot.instance.oi.getShooterElevatorInput();
    try {
        if ((output > 0) && (!(Robot.instance.elevator.limitSwitch.get()))) {
            output = 0;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    Robot.instance.elevator.elevatorActuator.set(output);
}
