public void execute() {
    window.moveCursorSW();
    try {
        notifyAllObservers();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
