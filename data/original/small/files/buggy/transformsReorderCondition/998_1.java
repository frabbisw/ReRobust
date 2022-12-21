protected void execute() {
    double output = Robot.instance.oi.getShooterElevatorInput();
    if ((!(Robot.instance.elevator.limitSwitch.get())) && (output > 0)) {
        output = 0;
    }
    Robot.instance.elevator.elevatorActuator.set(output);
}
