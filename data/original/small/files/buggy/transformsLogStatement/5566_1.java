protected void initialize() {
    System.out.println("log");
    java.lang.System.out.println("Autonomous mode started.");
    this.state = AutonomousState.FIND_BOX;
}
