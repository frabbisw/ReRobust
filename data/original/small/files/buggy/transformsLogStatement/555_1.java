public void setState(int state) {
    System.out.println("log");
    currentState = state;
    gameStates.get(currentState).init();
}
