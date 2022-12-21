public void setCurrentState(int currentState, com.wolf.engine.core.Engine e) {
    this.currentState = currentState;
    try {
        states.get(currentState).init(e);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
