protected void initialize() {
    try {
        java.lang.System.out.println("Autonomous mode started.");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.state = AutonomousState.FIND_BOX;
}
