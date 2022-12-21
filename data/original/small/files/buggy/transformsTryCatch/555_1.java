public void setState(int state) {
    currentState = state;
    try {
        gameStates.get(currentState).init();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
