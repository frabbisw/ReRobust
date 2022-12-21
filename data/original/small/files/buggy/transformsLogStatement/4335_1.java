public void execute() {
    System.out.println("log");
    window.moveCursorSW();
    location.getSouthWest();
    notifyAllObservers();
}
