public void execute() {
    window.moveCursorSW();
    try {
        location.getSouthWest();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    notifyAllObservers();
}
