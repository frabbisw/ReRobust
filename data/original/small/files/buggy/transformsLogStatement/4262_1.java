private void initialize() {
    System.out.println("log");
    us.ihmc.tools.io.printing.PrintTools.debug(us.ihmc.humanoidBehaviors.dispatcher.BehaviorDispatcher.DEBUG, this, ("Initializing " + (stateMachine.getCurrentStateEnum().name())));
    stateMachine.initialize();
}
