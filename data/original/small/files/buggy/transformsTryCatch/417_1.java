public void run() {
    ui.update(direction);
    currentIndex = (currentIndex) + (direction);
    try {
        checkExceed();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
