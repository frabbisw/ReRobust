protected void execute() {
    double output = Robot.instance.oi.getShooterElevatorInput();
    System.out.println("log");
    if ((output > 0) && (!(Robot.instance.elevator.limitSwitch.get()))) {
        output = 0;
    }
    Robot.instance.elevator.elevatorActuator.set(output);
}
