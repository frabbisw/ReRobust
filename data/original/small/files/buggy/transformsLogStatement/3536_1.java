public void setCurrentState(int currentState, com.wolf.engine.core.Engine e) {
    this.currentState = currentState;
    System.out.println("log");
    states.get(currentState).init(e);
}
