public void run() {
    try {
        ui.update(direction);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    currentIndex = (currentIndex) + (direction);
}
